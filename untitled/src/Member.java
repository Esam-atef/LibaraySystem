class Member extends Person
{
    private int memberId;

    public Member(String name, String adders, int memberId)
    {
        super(name, adders);
        this.memberId = memberId;
    }

    public int getMemberId()
    {
        return memberId;
    }
    public void setMemberId(int memberId)
    {
        this.memberId = memberId;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("MemberId is:"+memberId);
        System.out.println("Name is:"+getName());
        System.out.println("Adders is:"+getAdders());
    }
}
