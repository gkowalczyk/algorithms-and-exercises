package mod2_3;

public class LCGRandom {

        private long a = 25214903917L;
        private long c = 11;
        private long m = (1L << 48);
        private long seed;

        public LCGRandom(long seed) {
            this.seed = seed;
        }

        public long next() {
            seed = (a * seed + c) % m;
            return seed;
        }

        public static void main(String[] args) {
            LCGRandom lcg = new LCGRandom(1L);
            for (int i = 0; i < 10; i++) {
                System.out.println(lcg.next());
            }
        }
    }

