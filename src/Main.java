import com.workintech.composiition.*;

public class Main {
    public static void main(String[] args) {
Bedroom bedroom =new Bedroom("prenses",new Wall("dogu"),new Wall("batı"),new Wall("kuzey"),new Wall("guney"), new Ceiling(11, PaintColor.WHITE), new Bed(2,4,6,3,"kare"),new Lamp(89,true,LampType.LED_LAMP),new Wardrobe(12,13,10),new Carpet(8,8,PaintColor.GRAY));
      bedroom.getCarpet().lying();

    }

}