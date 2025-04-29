package yarnwrap.client.toast;
public class RecipeToast { public net.minecraft.client.toast.RecipeToast wrapperContained; public RecipeToast(net.minecraft.client.toast.RecipeToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List recipes() { return wrapperContained.recipes; }
// public void recipes(java.util.List value) { wrapperContained.recipes = value; }
// public static java.util.List recipes() { return net.minecraft.client.toast.RecipeToast.recipes; }
// public static void recipes(java.util.List value, ) { net.minecraft.client.toast.RecipeToast.recipes = value; }

// public boolean justUpdated() { return wrapperContained.justUpdated; }
// public void justUpdated(boolean value) { wrapperContained.justUpdated = value; }
// public static boolean justUpdated() { return net.minecraft.client.toast.RecipeToast.justUpdated; }
// public static void justUpdated(boolean value, ) { net.minecraft.client.toast.RecipeToast.justUpdated = value; }

// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public static long startTime() { return net.minecraft.client.toast.RecipeToast.startTime; }
// public static void startTime(long value, ) { net.minecraft.client.toast.RecipeToast.startTime = value; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.client.toast.RecipeToast.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.toast.RecipeToast.TITLE = value.wrapperContained; }

// public yarnwrap.text.Text DESCRIPTION() { return new yarnwrap.text.Text(wrapperContained.DESCRIPTION); }
// public void DESCRIPTION(yarnwrap.text.Text value) { wrapperContained.DESCRIPTION = value.wrapperContained; }
// public static yarnwrap.text.Text DESCRIPTION() { return new yarnwrap.text.Text(net.minecraft.client.toast.RecipeToast.DESCRIPTION); }
// public static void DESCRIPTION(yarnwrap.text.Text value, ) { net.minecraft.client.toast.RecipeToast.DESCRIPTION = value.wrapperContained; }

// public long DEFAULT_DURATION_MS() { return wrapperContained.DEFAULT_DURATION_MS; }
// public void DEFAULT_DURATION_MS(long value) { wrapperContained.DEFAULT_DURATION_MS = value; }
// public static long DEFAULT_DURATION_MS() { return net.minecraft.client.toast.RecipeToast.DEFAULT_DURATION_MS; }
// public static void DEFAULT_DURATION_MS(long value, ) { net.minecraft.client.toast.RecipeToast.DEFAULT_DURATION_MS = value; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public static yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(net.minecraft.client.toast.RecipeToast.TEXTURE); }
// public static void TEXTURE(yarnwrap.util.Identifier value, ) { net.minecraft.client.toast.RecipeToast.TEXTURE = value.wrapperContained; }

public RecipeToast(yarnwrap.recipe.RecipeEntry recipe) { this.wrapperContained = new net.minecraft.client.toast.RecipeToast(recipe.wrapperContained); }
// public void addRecipes(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.addRecipes(recipe.wrapperContained); }
// public static void addRecipes(yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.client.toast.RecipeToast.addRecipes(recipe.wrapperContained); }
// public void show(yarnwrap.client.toast.ToastManager manager,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.show(manager.wrapperContained,recipe.wrapperContained); }
// public static void show(yarnwrap.client.toast.ToastManager manager,yarnwrap.recipe.RecipeEntry recipe, ) { net.minecraft.client.toast.RecipeToast.show(manager.wrapperContained,recipe.wrapperContained); }

}