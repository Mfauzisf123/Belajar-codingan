class Piano extends MusicalInstrument {
    public Piano(String type, String brand) {
        super(type, brand);
    }

    @Override
    public void playSound() {
        System.out.println(brand + " " + type + " piano plays: Ding Ding!");
    }
}
