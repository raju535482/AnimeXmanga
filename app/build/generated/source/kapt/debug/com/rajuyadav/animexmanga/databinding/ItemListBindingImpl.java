package com.rajuyadav.animexmanga.databinding;
import com.rajuyadav.animexmanga.R;
import com.rajuyadav.animexmanga.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemListBindingImpl extends ItemListBinding implements com.rajuyadav.animexmanga.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.list_item_imgView_icon, 3);
        sViewsWithIds.put(R.id.linearLayout, 4);
        sViewsWithIds.put(R.id.list_item_txtView_title, 5);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.listItemTxtViewDescription.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.rajuyadav.animexmanga.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainmodel == variableId) {
            setMainmodel((com.rajuyadav.animexmanga.viewmodel.MainViewModel) variable);
        }
        else if (BR.modelanimeinfo == variableId) {
            setModelanimeinfo((com.rajuyadav.animexmanga.modelclass.Animeinfo) variable);
        }
        else if (BR.intPosition == variableId) {
            setIntPosition((java.lang.Integer) variable);
        }
        else if (BR.imgURL == variableId) {
            setImgURL((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainmodel(@Nullable com.rajuyadav.animexmanga.viewmodel.MainViewModel Mainmodel) {
        this.mMainmodel = Mainmodel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mainmodel);
        super.requestRebind();
    }
    public void setModelanimeinfo(@Nullable com.rajuyadav.animexmanga.modelclass.Animeinfo Modelanimeinfo) {
        this.mModelanimeinfo = Modelanimeinfo;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.modelanimeinfo);
        super.requestRebind();
    }
    public void setIntPosition(@Nullable java.lang.Integer IntPosition) {
        this.mIntPosition = IntPosition;
    }
    public void setImgURL(@Nullable java.lang.Integer ImgURL) {
        this.mImgURL = ImgURL;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.rajuyadav.animexmanga.viewmodel.MainViewModel mainmodel = mMainmodel;
        com.rajuyadav.animexmanga.modelclass.Animeinfo modelanimeinfo = mModelanimeinfo;
        java.lang.String stringValueOfModelanimeinfoMangaChap = null;
        int modelanimeinfoMangaChap = 0;

        if ((dirtyFlags & 0x12L) != 0) {



                if (modelanimeinfo != null) {
                    // read modelanimeinfo.manga_chap
                    modelanimeinfoMangaChap = modelanimeinfo.getManga_chap();
                }


                // read String.valueOf(modelanimeinfo.manga_chap)
                stringValueOfModelanimeinfoMangaChap = java.lang.String.valueOf(modelanimeinfoMangaChap);
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.listItemTxtViewDescription, stringValueOfModelanimeinfoMangaChap);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // mainmodel != null
        boolean mainmodelJavaLangObjectNull = false;
        // mainmodel
        com.rajuyadav.animexmanga.viewmodel.MainViewModel mainmodel = mMainmodel;
        // modelanimeinfo
        com.rajuyadav.animexmanga.modelclass.Animeinfo modelanimeinfo = mModelanimeinfo;



        mainmodelJavaLangObjectNull = (mainmodel) != (null);
        if (mainmodelJavaLangObjectNull) {



            mainmodel.onItemClick(modelanimeinfo);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainmodel
        flag 1 (0x2L): modelanimeinfo
        flag 2 (0x3L): intPosition
        flag 3 (0x4L): imgURL
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}