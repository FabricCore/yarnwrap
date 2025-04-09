package yarnwrap.component.type;
public class BookContent { public net.minecraft.component.type.BookContent wrapperContained; public BookContent(net.minecraft.component.type.BookContent wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List pages() { return wrapperContained.pages(); }
public java.lang.Object withPages(java.util.List pages) { return wrapperContained.withPages(pages); }

}