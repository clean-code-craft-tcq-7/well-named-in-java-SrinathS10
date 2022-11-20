package colorcoder;

public class GetColorPairInfo {

    public static Color getColorFromIndex(Color[] colors, int index){
        for(Color color:colors){
            if(index == color.getIndex()){
                return color;
            }
        }
        return null;
    }

    static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor =
                (MajorColor) getColorFromIndex(MajorColor.values(),zeroBasedPairNumber / ColorNames.numberOfMinorColors);
        MinorColor minorColor =
                (MinorColor) getColorFromIndex(MinorColor.values(),zeroBasedPairNumber % ColorNames.numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }

    static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * ColorNames.numberOfMinorColors + minor.getIndex() + 1;
    }

    static String getColorPairManual(){
        String colorPairManual = new String("");
        for(int i=1;i<=25;i++){
            colorPairManual += ( i + " - " + getColorFromPairNumber(i).ToString() + "\n");
        }
        return colorPairManual;
    }
}
