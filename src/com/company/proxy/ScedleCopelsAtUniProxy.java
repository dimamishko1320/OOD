package com.company.proxy;

public class ScedleCopelsAtUniProxy implements ClassSchedule {

    private ClassSchedule classSchedule = new SchedleCoupelsAtUni();
    private String[] scheduleCache = null;

    @Override
    public String[] getSchedule() {
        if(scheduleCache == null) {
            scheduleCache =classSchedule.getSchedule();
        }
        return scheduleCache;
    }

    @Override
    public String getBeginningOfLesson(String lessonN) {
        if(scheduleCache == null) {
           scheduleCache = classSchedule.getSchedule();
        }
        for(int i = 0; i < scheduleCache.length; i++) {
            if(scheduleCache[i].startsWith(lessonN+";")) return scheduleCache[i];
        }
        return "";
    }

    public void clearCache() {
       classSchedule = null;
    }
}
