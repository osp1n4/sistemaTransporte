package com.sofkau.qa.sistematransporte.repository.modelo;

import java.util.Objects;

    public class Bus {
        private String id;
        private String tipoBus;
        private int cupo;

        // private Calendar horarioSalida;


        public Bus() {
        }

        public Bus(String id, String tipoBus, int cupo) {
            this.id = id;
            this.tipoBus = tipoBus;
            this.cupo = cupo;
        }

        public String id() {
            return id;
        }

        public Bus setId(String id) {
            this.id = id;
            return this;
        }

        public String tipoBus() {
            return tipoBus;
        }

        public Bus setTipoBus(String tipoBus) {
            this.tipoBus = tipoBus;
            return this;
        }

        public int cupo() {
            return cupo;
        }

        public Bus setCupo(int cupo) {
            this.cupo = cupo;
            return this;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Bus)) return false;
            Bus bus = (Bus) o;
            return id.equals(bus.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "Bus{" +
                    "tipoBus='" + tipoBus + '\'' +
                    ", cupo=" + cupo +
                    '}';
        }

}
