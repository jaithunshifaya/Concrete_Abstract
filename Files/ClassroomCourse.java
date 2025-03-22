class ClassroomCourse extends Course  {
    public String school;
    private String session;
    public ClassroomCourse(Subject subject, String instructor,int fee, String school, String session){
        super(subject, instructor , fee);
        this.school =school;
        this.session=session;
    }
    public String toString(){
        return "Classroom course at" + school + ", session:" + session;
    }
    public String getSchool(){
        return school;
    }
}
