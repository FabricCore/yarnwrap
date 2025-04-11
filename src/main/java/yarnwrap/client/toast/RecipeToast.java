package yarnwrap.client.toast;
public class RecipeToast { public net.minecraft.client.toast.RecipeToast wrapperContained; public RecipeToast(net.minecraft.client.toast.RecipeToast wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List recipes() { return wrapperContained.recipes; }
// public void recipes(java.util.List value) { wrapperContained.recipes = value; }
// public boolean justUpdated() { return wrapperContained.justUpdated; }
// public void justUpdated(boolean value) { wrapperContained.justUpdated = value; }
// public long startTime() { return wrapperContained.startTime; }
// public void startTime(long value) { wrapperContained.startTime = value; }
// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public yarnwrap.text.Text DESCRIPTION() { return new yarnwrap.text.Text(wrapperContained.DESCRIPTION); }
// public void DESCRIPTION(yarnwrap.text.Text value) { wrapperContained.DESCRIPTION = value.wrapperContained; }
// public long DEFAULT_DURATION_MS() { return wrapperContained.DEFAULT_DURATION_MS; }
// public void DEFAULT_DURATION_MS(long value) { wrapperContained.DEFAULT_DURATION_MS = value; }
// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public void TEXTURE(yarnwrap.util.Identifier value) { wrapperContained.TEXTURE = value.wrapperContained; }
// public void addRecipes(yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.addRecipes(recipe.wrapperContained); }
public void show(yarnwrap.client.toast.ToastManager manager,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.show(manager.wrapperContained,recipe.wrapperContained); }

}