class Country{
        void found(){
            System.out.println("Country is foundd");
        }
    public static void main(String[] args){
        
        Country India = new Country();
        Country Srilanka = new Country();

        India.found();
        Srilanka.found();


        // javac Country.java
        // java Country
        
    }
}