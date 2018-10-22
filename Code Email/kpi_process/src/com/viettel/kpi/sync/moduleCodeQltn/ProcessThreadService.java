/*
 * Copyright 2012 Viettel Telecom. All rights reserved.
 * VIETTEL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.viettel.kpi.sync.moduleCodeQltn;

import com.viettel.haframework.fw.ZkProcessMX;
import com.viettel.kpi.common.utils.DateTimeUtils;
import org.apache.log4j.Logger;

/**
 *
 * @author os_tienbv2
 */
public class ProcessThreadService extends ZkProcessMX {

    private MyDbTask db;

    private static final Logger logger = Logger.getLogger(ProcessThreadService.class);

    public ProcessThreadService() {
        super("logServerDl");
    }

    @Override
    public void process() {
        try {
            db = new MyDbTask();

            int currHour = DateTimeUtils.getCurrentHour();

            logger.info("hour current: " + currHour);
            logger.info("hour run: " + Start.hourRun);
            if (currHour == Start.hourRun) {
                MyJob job = new MyJob(db);
                job.run();
            } else {
                logger.info("Chua den thoi gian chay tien trinh");
            }
        } catch (Exception ex) {
            logger.info(ex.getMessage(), ex);
        } finally {
            try {
                if (db != null) {
                    db.close();
                }
            } catch (Exception ex) {
                logger.info(ex.getMessage(), ex);
            }
            try {
                long currMin = DateTimeUtils.getCurrentMinute();
                long sleepTime = (60 - currMin) * 60 * 1000;
                logger.info("Thread " + this.threadName + " sleep " + sleepTime / 1000 + " seconds");
                Thread.sleep(sleepTime);
            } catch (Exception e) {
            }
        }
    }
}
