import java.util.Random;

public class Cube {

    Cube.Colour[] up;
    Cube.Colour[] down;
    Cube.Colour[] left;
    Cube.Colour[] right;
    Cube.Colour[] back;
    Cube.Colour[] front;

    public enum Colour {
        G, B, Y, W, R, O
    }

    Cube.Colour[] up0 = {
            Cube.Colour.W, Cube.Colour.W, Cube.Colour.W, Cube.Colour.W, Cube.Colour.W, Cube.Colour.W, Cube.Colour.W, Cube.Colour.W, Cube.Colour.W
    };
    Cube.Colour[] down0 = {
            Cube.Colour.Y, Cube.Colour.Y, Cube.Colour.Y, Cube.Colour.Y, Cube.Colour.Y, Cube.Colour.Y, Cube.Colour.Y, Cube.Colour.Y, Cube.Colour.Y
    };
    Cube.Colour[] left0 = {
            Cube.Colour.R, Cube.Colour.R, Cube.Colour.R, Cube.Colour.R, Cube.Colour.R, Cube.Colour.R, Cube.Colour.R, Cube.Colour.R, Cube.Colour.R
    };
    Cube.Colour[] right0 = {
            Cube.Colour.O, Cube.Colour.O, Cube.Colour.O, Cube.Colour.O, Cube.Colour.O, Cube.Colour.O, Cube.Colour.O, Cube.Colour.O, Cube.Colour.O
    };
    Cube.Colour[] back0 = {
            Cube.Colour.G, Cube.Colour.G, Cube.Colour.G, Cube.Colour.G, Cube.Colour.G, Cube.Colour.G, Cube.Colour.G, Cube.Colour.G, Cube.Colour.G
    };
    Cube.Colour[] front0 = {
            Cube.Colour.B, Cube.Colour.B, Cube.Colour.B, Cube.Colour.B, Cube.Colour.B, Cube.Colour.B, Cube.Colour.B, Cube.Colour.B, Cube.Colour.B
    };


    Cube(){

        up = up0;
        down = down0;
        left = left0;
        right = right0;
        back = back0;
        front = front0;
        shuffle();
    }

    private void shuffle() {

        //TODO shuffling
/*        Random generator = new Random();

        for(int i = 0; i < 100; i++){
            int actionNumber = generator.nextInt()%6;
            switch (actionNumber) {
                case 0:
                    move

            }
        }
*/
    }


}