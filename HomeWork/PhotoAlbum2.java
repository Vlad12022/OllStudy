package HomeWork;

public class PhotoAlbum2 {  //2 �������

    private String color;
    private Page page;
    private boolean isOpen;
    private Photo photo;

    public PhotoAlbum2(String color, Page page, Photo photo) {
        this.color = color;
        this.page = page;
        this.photo = photo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public void open() {
        this.isOpen = true;
        System.out.println("������ ������...");
    }

    public void alreadyHavePhoto(Photo... photo) {
        for (Photo photo1 : photo) {
            this.page.alreadyHave(photo1);
        }
    }

    public void addPhotoToAlbum(String name) {
        this.page.addPhoto(name);
    }

    public void close() {
        this.isOpen = false;
        System.out.println("������ ������.");
    }
}

class Page {
    private Photo photo;

    public Page() {
        this.photo = photo;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public void addPhoto(String name) {
        System.out.println("��������� ����� ���������� : " + name + "," + " �������� 5 ");
    }

    public void alreadyHave(Photo photo) {
        Photo[] photo1 = new Photo[4];
        photo1[0] = new Photo("�����");
        photo1[1] = new Photo("������");
        photo1[2] = new Photo("������");
        photo1[3] = new Photo("������");

        StringBuilder res = new StringBuilder();
        res.append("���������� ������� ��� ���� � �������: ");
        for (int i = 0; i < photo1.length; i++) {
            res.append(photo1[i]).append(" ").append(i + 1).append(" �������� ").append(",");
        }
        System.out.println(res.substring(0, res.length() - 1));
    }
}

class Photo {
    private String name;

    public Photo(String name) {
        this.name = name;
    }

    public Photo() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " Photo: " + name;
    }
}

class Maid {
    public static void main(String[] args) {
        Photo photo = new Photo();
        Page page = new Page();

        PhotoAlbum2 photoAlbum2 = new PhotoAlbum2("White", page, photo);
        photoAlbum2.open();
        photoAlbum2.alreadyHavePhoto(photo);
        photoAlbum2.addPhotoToAlbum("������");
        photoAlbum2.close();

    }
}
