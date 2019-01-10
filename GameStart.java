
package tank;


public class GameStart
{
    public static void main( String[] args )
    {

        System.out.println(System.getProperty("user.dir"));
        SoundEffects play_sound = new SoundEffects();
         play_sound.play_continously(System.getProperty("user.dir")+"/src/resource/Music.wav");
         new GameFrame( new ControlPanel() );
     }
}
