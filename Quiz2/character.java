public abstract class character {
    protected String name;

    public character(String name) {
        this.name = name;
    }
    public abstract void destroy(DestroyAble da);
}
