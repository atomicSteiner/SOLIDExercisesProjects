package Exercise3;

interface Storage {
    void upload(String data);
    void delete(String id);
}


class S3Storage implements Storage {
    public void upload(String data) { System.out.println("Uploading to AWS..."); }
    public void delete(String id) { System.out.println("Deleting from AWS..."); }
}


class ReadOnlyBackup implements Storage {
    public void upload(String data) { System.out.println("Uploading only..."); }
    public void delete(String id) {
        throw new UnsupportedOperationException("Cannot delete from read-only!");
    }
}

class BackupManager {
    private S3Storage storage = new S3Storage();
    public void performBackup(String data) {
        storage.upload(data);
    }
}
