package edu.umb.cs680.hw07;

import java.time.LocalDateTime;
import java.util.LinkedList;
public class Directory extends FSElement {
	
    private LinkedList<FSElement> children;
    public Directory(Directory parent, String name, LocalDateTime creationTime) {
        super(parent, name, 0, creationTime);
        children = new LinkedList<FSElement>();
    }; 

    public LinkedList<FSElement> getChildren() {
        return this.children;
    }
    
    public void appendChild(FSElement elem) {
        for (FSElement child : this.children) {
            if (elem.getName() == child.getName()) {
                if (elem.isDirectory() && child.isDirectory()) {
                    throw new RuntimeException("Directory already exists!");
                }
                else if (!elem.isDirectory() && !child.isDirectory()) {
                    throw new RuntimeException("File already exists!");
                }
            }
        }
        this.children.add(elem);
    }
    public int countChildren() {
        return this.children.size();
    }

    public LinkedList<Directory> getSubDirectories() {
        LinkedList<Directory> s = new LinkedList<Directory>();
        for (FSElement f : this.getChildren()) {
            if (f.isDirectory()) {
            	s.add((Directory)f);
            }
        }
        return s;
    }

    public LinkedList<File> getFiles() {
        LinkedList<File> files = new LinkedList<File>();
        for (FSElement f : this.getChildren()) {
            if (!f.isDirectory()) {
            	files.add((File)f);
            }
        }
        return files;
    }
    public int getTotalSize() {
        int fileTotalSize = getFiles().stream().mapToInt(f->f.getSize()).sum();
        int directoryTotalSize = getSubDirectories().stream().mapToInt(d->d.getTotalSize()).sum();
        return fileTotalSize + directoryTotalSize + this.getSize();
    }

    public boolean isDirectory() {
        return true;
    }

}
