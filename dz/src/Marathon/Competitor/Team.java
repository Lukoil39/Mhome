package Marathon.Competitor;

import Marathon.Competitor.Competitor;

public class Team {
    String teamName;
    Competitor[] teamMembers = new Competitor[4]; //массив


    public Team(String teamName, Competitor[] teamMembers) {//конструктор
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public String getTeamName(){
        return "Название команды: "+teamName;
    }

    public Competitor[] getMembers(){
        return teamMembers;
    }

    public void showResults(){
        for(Competitor c: teamMembers){
            c.showResult();//показываем результаты
        }
    }

    public void showMembersFinishedCourse() {
        for(Competitor c: teamMembers) {
            if(c.isOnDistance())
                c.showResult();//показыаем результаты
        }
    }
}

