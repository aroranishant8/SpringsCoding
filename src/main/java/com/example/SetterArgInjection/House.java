package com.example.SetterArgInjection;

public class House {
    DiningRoom diningRoom;
    BathRoom bathRoom;
    StudyRoom studyRoom;

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public void setBathRoom(BathRoom bathRoom) {
        this.bathRoom = bathRoom;
    }

    public void setStudyRoom(StudyRoom studyRoom) {
        this.studyRoom = studyRoom;
    }


}
