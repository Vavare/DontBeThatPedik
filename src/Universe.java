import java.util.Random.*;
import java.util.ArrayList;



class Universe {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            for (human : humans) {
                human.live();
                    if(human.alive == false)
                        DeadHumans.add(human);
            }

            //нужно убрать всех DeadHumans
            for (Human deadHuman : deadHumans) {
                humans.remove(deadHuman);
            }
            deadHumans.clear();
        }

    }

abstract class Human(int age, char sex, int coordinate, boolean alive){

        public int age;         //от 0 до 65
        public char sex;        //м - мужчина, w- женщина, p - педик
        public int coordinate;   //от минус бесконечности до плюс бесконечности
        public boolean alive;     //по умолчанию "жив"

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private char getSex() {
        return sex;
    }

    private void setSex(char sex) {
        this.sex = sex;
    }

    private int getCoordinate() {
        return coordinate;
    }

    private void setCoordinate(int coordinate) {
        this.coordinate = coordinate;
    }

    private boolean isAlive() {
        return alive;
    }

    private void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void live (){
           move();
          tryCoitus();
          tryAlive();

    }
    private void move() {
        switch (Random.nextInt(2)) {
            case 0:
                coordinate--;
                  break;
                case 1:
                    coordinate++;
                    break;
                default:
                    break;
            }
        }
    private void tryAlive{
    }
    private void tryCoitus{

    }
    }
}
