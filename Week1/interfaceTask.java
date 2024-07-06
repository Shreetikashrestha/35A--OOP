public class interfaceTask {
    
}
/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 * Make a class AppleMusic and implement DigitalMedia and OnlineAsset
 */ 

interface Media {
     void play();
     void pause();
     void next();
    void previous();
    String nowPlaying();
}
interface DigitalMedia extends Media{
     double size();
     double remaining(double current);
}



interface OnlineAsset{
    public void download();
}

class Spotify implements DigitalMedia,OnlineAsset{
    @Override
    public double size(){
        System.out.println("double sizing")
        return 4.4;
    }
    @Override
    public double remaining(double current){
        return 2.2;
    }
    @Override
    public void download(){
        System.out.println("downloading ");
    }

    @Override
    public  void play (){
        System.out.println("playing");
    }
    @Override
    public  void pause (){
        System.out.println("pausing");
    }
    @Override
    public  void next (){
        System.out.println("next");

    }
    @Override
    public  void previous (){
        System.out.println("previous");

    }
    @Override
    public String nowPlaying(){
        System.out.println("nowplaying ");
        return "hi";

    }
    class AppleMusic implements DigitalMedia,OnlineAsset{
    @Override
    public double size(){
        System.out.println("double sizing");
        return 4.4;
    }
    @Override
    public double remaining(double current){
        return 2.2;
    }
    @Override
    public void download(){
        System.out.println("downloading ");
    }

    @Override
    public  void play (){
        System.out.println("playing");
    }
    @Override
    public  void pause (){
        System.out.println("pausing");
    }
    @Override
    public  void next (){
        System.out.println("next");

    }
    @Override
    public  void previous (){
        System.out.println("previous");

    }
    @Override
    public String nowPlaying(){
        System.out.println("nowplaying ");
        return "hi";

    }
        

        

}


        

}
