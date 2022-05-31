class MultiplicationTable{
    // void print(){
    //     print(5);
    // }
    void print(int k, int from, int to){
        for(int i=from; i<=to; i++){
            System.out.printf("%d * %d = %d", k,i,i*k).println();
        }
    }
    public static void main(String[] args){
        MultiplicationTable table = new MultiplicationTable();
        // table.print();
        table.print(10, 1, 10);
    }
}