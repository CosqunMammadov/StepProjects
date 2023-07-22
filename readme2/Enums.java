package happyFamily.readme2;

enum Species {
        CAT(false, true, 4),
        DOG(false, true, 4),
        FISH(false, false, 0),
        BIRD(true, false, 2);

        private final boolean canFly;
        private final boolean hasFur;
        private final int numberOfLegs;

        Species(boolean canFly, boolean hasFur, int numberOfLegs) {
                this.canFly = canFly;
                this.hasFur = hasFur;
                this.numberOfLegs = numberOfLegs;
        }

        public boolean isCanFly() {
                return canFly;
        }

        public boolean isHasFur() {
                return hasFur;
        }

        public int getNumberOfLegs() {
                return numberOfLegs;
        }
}
enum DayofWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
}
