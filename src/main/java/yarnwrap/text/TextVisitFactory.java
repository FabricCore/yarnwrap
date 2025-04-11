package yarnwrap.text;
public class TextVisitFactory { public net.minecraft.text.TextVisitFactory wrapperContained; public TextVisitFactory(net.minecraft.text.TextVisitFactory wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional VISIT_TERMINATED() { return wrapperContained.VISIT_TERMINATED; }
// public void VISIT_TERMINATED(java.util.Optional value) { wrapperContained.VISIT_TERMINATED = value; }
// public char REPLACEMENT_CHARACTER() { return wrapperContained.REPLACEMENT_CHARACTER; }
// public void REPLACEMENT_CHARACTER(char value) { wrapperContained.REPLACEMENT_CHARACTER = value; }
public java.lang.String validateSurrogates(java.lang.String text) { return wrapperContained.validateSurrogates(text); }
public boolean visitFormatted(java.lang.String text,int startIndex,yarnwrap.text.Style style,yarnwrap.text.CharacterVisitor visitor) { return wrapperContained.visitFormatted(text,startIndex,style.wrapperContained,visitor.wrapperContained); }
public boolean visitFormatted(java.lang.String text,int startIndex,yarnwrap.text.Style startingStyle,yarnwrap.text.Style resetStyle,yarnwrap.text.CharacterVisitor visitor) { return wrapperContained.visitFormatted(text,startIndex,startingStyle.wrapperContained,resetStyle.wrapperContained,visitor.wrapperContained); }
public boolean visitForwards(java.lang.String text,yarnwrap.text.Style style,yarnwrap.text.CharacterVisitor visitor) { return wrapperContained.visitForwards(text,style.wrapperContained,visitor.wrapperContained); }
public boolean visitFormatted(yarnwrap.text.StringVisitable text,yarnwrap.text.Style style,yarnwrap.text.CharacterVisitor visitor) { return wrapperContained.visitFormatted(text.wrapperContained,style.wrapperContained,visitor.wrapperContained); }
// public boolean visitRegularCharacter(yarnwrap.text.Style style,yarnwrap.text.CharacterVisitor visitor,int index,char c) { return wrapperContained.visitRegularCharacter(style.wrapperContained,visitor.wrapperContained,index,c); }
public boolean visitBackwards(java.lang.String text,yarnwrap.text.Style style,yarnwrap.text.CharacterVisitor visitor) { return wrapperContained.visitBackwards(text,style.wrapperContained,visitor.wrapperContained); }
public boolean visitFormatted(java.lang.String text,yarnwrap.text.Style style,yarnwrap.text.CharacterVisitor visitor) { return wrapperContained.visitFormatted(text,style.wrapperContained,visitor.wrapperContained); }
public java.lang.String removeFormattingCodes(yarnwrap.text.StringVisitable text) { return wrapperContained.removeFormattingCodes(text.wrapperContained); }

}