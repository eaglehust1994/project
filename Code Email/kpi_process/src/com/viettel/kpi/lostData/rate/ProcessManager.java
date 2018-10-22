/*
 * Copyright YYYY Viettel Telecom. All rights reserved.
 * VIETTEL PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.viettel.kpi.lostData.rate;

import com.viettel.haframework.fw.ZkProcess;
import com.viettel.kpi.common.utils.DataConfig;
import com.viettel.mmserver.agent.MmJMXServerSec;
import java.util.ArrayList;

/**
 *
 * @author dungvv8
 */
public class ProcessManager extends ZkProcess {

    private static long interval;
    private static long hourRun;
    private static String updateTime;
    private static String ipClient;
    private static String urlClient;
    private static String usernameClient;
    private static String passwordClient;
    private static boolean reload;
    protected static String pro = "../conf/program.conf";
    static ArrayList<ProcessThreadService> listProcess;
    private static ProcessManager manager;
    public static void startManager() {
        try {
            ProcessThreadService process;
            listProcess = new ArrayList();
            DataConfig.init(pro);
            interval = DataConfig.getLongProperties("interval", 3600000);
            hourRun = DataConfig.getLongProperties("hourRun", 3L);
            reload = DataConfig.getBoolProperties("reload", false);
            updateTime = DataConfig.getStringProperties("updateTime");
            ipClient = DataConfig.getStringProperties("ipClient");
            urlClient = DataConfig.getStringProperties("urlClient");
            usernameClient = DataConfig.getStringProperties("usernameClient");
            passwordClient = DataConfig.getStringProperties("passwordClient");

            process = new ProcessThreadService(interval, updateTime, hourRun,
                    reload, ipClient, urlClient,usernameClient,passwordClient);
            listProcess.add(process);
//            process.start();
            //HA_start
            manager = new ProcessManager();
            manager.start();
            //HA_end
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    //--------------------------------------------------------------------------
    /**
     * Stop tien trinh
     *
     * @author: TienBV2
     * @date: 30/11/2012
     */
    public static void stopManager() {
        MmJMXServerSec.getInstance().stop();
        if (listProcess != null && listProcess.size() > 0) {
            for (ProcessThreadService process : listProcess) {
                try {
                    process.stop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    protected void doStart() {
        for (ProcessThreadService process : listProcess) {
            try {
                process.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void doStop() {
        for (ProcessThreadService process : listProcess) {
            try {
                process.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
