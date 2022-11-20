package colorcoder;

public class TestColorPair {
    static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor)
    {
        ColorPair colorPair = GetColorPairInfo.getColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    static void testPairToNumber(MajorColor major,MinorColor minor,int expectedPairNumber)
    {
        int pairNumber = GetColorPairInfo.getPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }
}

