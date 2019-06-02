package effective_java_practice.model;

enum CrustType {
    SOURDOUGH,
    NORMAL;
}

enum SauceType {
    RED,
    WHITE;
}
enum ToppingQuantity {
    NORMAL,
    EXTRA,
    DOUBLE_EXTRA;
}

public class Pizza {
    private CrustType crustType;
    private SauceType sauceType;

    private ToppingQuantity mushrooms;
    private ToppingQuantity pepperoni;
    private ToppingQuantity onion;

    public Pizza(Builder builder) {
        this.crustType = builder.crustType;
        this.sauceType = builder.sauceType;
        this.mushrooms = builder.mushrooms;
        this.pepperoni = builder.pepperoni;
        this.onion = builder.onion;
    }

    public static class Builder {
        private CrustType crustType;
        private SauceType sauceType;

        private ToppingQuantity mushrooms;
        private ToppingQuantity pepperoni;
        private ToppingQuantity onion;

        public Builder(String crustType, String sauceType) {
            try {
                SauceType sauceTypeEnum = SauceType.valueOf(sauceType);
                CrustType crustTypeEnum = CrustType.valueOf(crustType);
                this.crustType = crustTypeEnum;
                this.sauceType = sauceTypeEnum;
            } catch (Exception e ){
                throw new IllegalArgumentException("Pizza base type does not exist");
            }
        }

        //Can throw same illegal argument exception in optional params... did not do it for brevity sake.
        public Builder withMushrooms(String mushrooms) {
            this.mushrooms = ToppingQuantity.valueOf(mushrooms);
            return this;
        }

        public Builder withPepperoni(String pepperoni) {
            this.pepperoni = ToppingQuantity.valueOf(pepperoni);
            return this;
        }

        public Builder withOnion(String onion) {
            this.onion = ToppingQuantity.valueOf(onion);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    public CrustType getCrustType() {
        return crustType;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public ToppingQuantity getMushrooms() {
        return mushrooms;
    }

    public ToppingQuantity getPepperoni() {
        return pepperoni;
    }

    public ToppingQuantity getOnion() {
        return onion;
    }
}
