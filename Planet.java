class Planet{
    void revolve(){
        System.out.println("Planet is Revolved");
    }
    public static void main(String[] args){
        Planet earth = new Planet();
        Planet mars = new Planet();

        earth.revolve();
        mars.revolve();
    }
}