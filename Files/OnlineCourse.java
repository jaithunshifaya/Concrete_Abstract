class OnlineCourse extends Course  {

    private int lessons;
    private int weeks;

    public OnlineCourse(Subject subject, String instructor, int fee, int lessons, int weeks) {
        super(subject,instructor,fee);
        this.lessons=lessons;
        this.weeks=weeks;

    }
    public OnlineCourse(Subject subject,String instructor, int fee){
        super(subject, instructor, fee);
        this.lessons=10;
        this.weeks=4;
    }

    @Override
    public String toString(){
        return "Online course with"+ lessons + "lessons over" + weeks + "weeks.";
    }
}
