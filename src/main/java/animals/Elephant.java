package animals;

public class Elephant extends Herbivore implements Run, Voice {
        private final String voice;


        public Elephant() {
            this.voice = "Ффффыыыыыы";
        }


        @Override
        public String getVoice() {
            return this.voice;
        }

        @Override
        public String run() {
            return "Слон бежит";
        }


}
