class Logger{
    private static Logger obj = new Logger();
    private Logger(){

    }
    static Logger getInstance(){
        return obj;
    }
}