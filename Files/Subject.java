class Subject {
    public String title;
    private double credits;

    public Subject(String title, double credits) {
        this.title = title;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Subject" + title + ", Credits:" + credits;

    }

    public String getTitle() {
        return title;
    }
}
