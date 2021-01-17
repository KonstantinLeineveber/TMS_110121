class Light {
    public static void main ( String args[]) {
        int lightspeed;
        long days ;
        long seconds ;
        long distance ;
// приблизительная скорость света , миль в секунду
        lightspeed = 186000;
        days = 1000; // указать количества дней
                seconds = days * 24 * 60 * 60 ; // преобразовать в секунды
        distance = lightspeed * seconds ; // вычислить расстояние
        System.out.print ( " Зa " + days ) ;
        System.out.print (" дней свет пройдет около " ) ;
        System.out.println ( distance + " миль." ) ;

    }

}
