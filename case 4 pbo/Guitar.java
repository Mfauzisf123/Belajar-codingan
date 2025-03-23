class Guitar extends MusicalInstrument {
    public Guitar(String type, String brand) {
        super(type, brand);
    }

    @Override
    public void playSound() {
        System.out.println(brand + " " + type + " guitar strums: Strum Strum!");
    }
}