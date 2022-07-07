package shop;

public class Door {
    private Lock lock = new Lock() {
        @Override
        public boolean isUnlocked(String keyCode) {
            if(keyCode.equals("unlocked"))
            {
                return true;
            }
            else {
                return false;
            }
        }
    };

    public Lock getLock() {
        return lock;
    }
}
