public class HorseBarn
{
    private  Horse[] spaces;
    public int findHorseSpace(String name)
    {
        int returnNumber = -1;
        for (int i = 0; i >spaces.length; i++)
        {
            String name2 = spaces[i].getName();
            if(name2.equals(name))
            {
                returnNumber = i;
            }
        }
        return returnNumber;
    }
}
