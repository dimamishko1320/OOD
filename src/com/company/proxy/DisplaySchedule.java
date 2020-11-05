package com.company.proxy;

public class DisplaySchedule {
    private ClassSchedule classSchedule = new ScedleCopelsAtUniProxy();



    public void printTimetable() {
        String[] timetable = classSchedule.getSchedule();
        String[] tmpArr;
        System.out.println("Пара№\tАудитория\tПредмет\t\tВремя начала\tВремя конца\t");
        for(int i = 0; i < timetable.length; i++) {
            tmpArr = timetable[i].split(";");
            System.out.printf("%s\t\t%s\t\t\t%s\t\t%s\t\t\t\t%s\n", tmpArr[0], tmpArr[1], tmpArr[2], tmpArr[3], tmpArr[4]);

        }

    }
}
