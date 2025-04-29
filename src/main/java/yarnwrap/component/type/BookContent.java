package yarnwrap.component.type;
public class BookContent { public net.minecraft.component.type.BookContent wrapperContained; public BookContent(net.minecraft.component.type.BookContent wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.List pages() { return wrapperContained.pages(); }
// public static java.util.List pages() { return net.minecraft.component.type.BookContent.pages(); }
public java.lang.Object withPages(java.util.List pages) { return wrapperContained.withPages(pages); }
// public static java.lang.Object withPages(java.util.List pages, ) { return net.minecraft.component.type.BookContent.withPages(pages); }

}