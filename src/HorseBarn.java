public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces) {
        this.spaces = spaces;
    }

    public void consolidate() {
        int x = 0;
        while (x < this.spaces.length - 1 == true) {
            if (this.spaces[x] == null) {
                for (int i = 0; i <this.spaces.length;i++) {
                    if (this.spaces[i] != null) {
                        this.spaces[x] = this.spaces[i];
                        this.spaces[i] = null;
                        i = this.spaces.length;
                    }

                }
            } else {
                x++;
            }
        }
    }


    public int findHorseSpace(String name) {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i] != null && name.equals(this.spaces[i].getName())) {
                return i;
            }
        }
        return -1;
    }
}
