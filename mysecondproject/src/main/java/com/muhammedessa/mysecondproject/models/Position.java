package com.muhammedessa.mysecondproject.models;

public enum Position {
    MANAGER, SUPERVISOR, TEAMLEADER, MEMBER;
 

public String toString(){
    switch(this){
        case MANAGER:
              return "Manager";
        case SUPERVISOR:
              return "Supervisor";
        case TEAMLEADER:
              return "Team leader";
        case MEMBER:
              return "Member"; 
    }
    return "";
}
}
