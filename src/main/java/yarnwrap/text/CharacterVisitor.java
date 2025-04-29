package yarnwrap.text;
public class CharacterVisitor { public net.minecraft.text.CharacterVisitor wrapperContained; public CharacterVisitor(net.minecraft.text.CharacterVisitor wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean accept(int index,yarnwrap.text.Style style,int codePoint) { return wrapperContained.accept(index,style.wrapperContained,codePoint); }
// public static boolean accept(int index,yarnwrap.text.Style style,int codePoint, ) { return net.minecraft.text.CharacterVisitor.accept(index,style.wrapperContained,codePoint); }

}