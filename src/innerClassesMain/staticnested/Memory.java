package innerClassesMain.staticnested;

public class Memory {

    private final Runtime runtime = Runtime.getRuntime();

    public Stats stats() {
        long free = runtime.freeMemory();
        long total = runtime.totalMemory();
        return new Stats( free, total - free, total );
    }

    public static class Stats {

        private final long free;
        private final long used;
        private final long total;

        public Stats( long free, long used, long total ) {
            this.free = free;
            this.used = used;
            this.total = total;
        }

        public long getFree() { return free; }

        public long getUsed() { return used; }

        public long getTotal() { return total; }

        @Override
        public String toString() {
            return "Stats [\n\tfree = " + free + ", \n\tused = " + used + ", \n\ttotal = " + total + "\n]";
        }        

        
    }
}
