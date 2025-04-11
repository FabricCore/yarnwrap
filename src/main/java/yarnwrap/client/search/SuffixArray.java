package yarnwrap.client.search;
public class SuffixArray { public net.minecraft.client.search.SuffixArray wrapperContained; public SuffixArray(net.minecraft.client.search.SuffixArray wrapperContained) { this.wrapperContained = wrapperContained; }

// public int maxTextLength() { return wrapperContained.maxTextLength; }
// public void maxTextLength(int value) { wrapperContained.maxTextLength = value; }
// public java.util.List objects() { return wrapperContained.objects; }
// public void objects(java.util.List value) { wrapperContained.objects = value; }
// public it.unimi.dsi.fastutil.ints.IntList suffixIndexToObjectIndex() { return wrapperContained.suffixIndexToObjectIndex; }
// public void suffixIndexToObjectIndex(it.unimi.dsi.fastutil.ints.IntList value) { wrapperContained.suffixIndexToObjectIndex = value; }
// public it.unimi.dsi.fastutil.ints.IntList characters() { return wrapperContained.characters; }
// public void characters(it.unimi.dsi.fastutil.ints.IntList value) { wrapperContained.characters = value; }
// public it.unimi.dsi.fastutil.ints.IntList offsetInText() { return wrapperContained.offsetInText; }
// public void offsetInText(it.unimi.dsi.fastutil.ints.IntList value) { wrapperContained.offsetInText = value; }
// public boolean PRINT_ARRAY() { return wrapperContained.PRINT_ARRAY; }
// public void PRINT_ARRAY(boolean value) { wrapperContained.PRINT_ARRAY = value; }
// public boolean PRINT_COMPARISONS() { return wrapperContained.PRINT_COMPARISONS; }
// public void PRINT_COMPARISONS(boolean value) { wrapperContained.PRINT_COMPARISONS = value; }
// public it.unimi.dsi.fastutil.ints.IntList textStarts() { return wrapperContained.textStarts; }
// public void textStarts(it.unimi.dsi.fastutil.ints.IntList value) { wrapperContained.textStarts = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public java.util.List findAll(java.lang.String text) { return wrapperContained.findAll(text); }
// public int compare(java.lang.String string,int suffixIndex) { return wrapperContained.compare(string,suffixIndex); }
public void add(java.lang.Object object,java.lang.String text) { wrapperContained.add(object,text); }
public void build() { wrapperContained.build(); }
// public java.lang.String getDebugString(int suffixIndex) { return wrapperContained.getDebugString(suffixIndex); }
// public void printArray() { wrapperContained.printArray(); }

}