# YuRecyclerView
A useful decoupling RecyclerView

解耦且便於管理的 Recyclerview


##  如何使用？

## How to use ?

### Gradle

**Step 1.** Add the JitPack repository to your build file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}


**Step 2.** Add the dependency

	dependencies {
	        implementation 'com.github.the-cryptodog:YuRecyclerView:0.1.0'
	}



**Step 3.** for create a new custimized recyclerView, add your own "xxxxModel" and "xxxxxViewHolder" and settle them like the sample as demo code.


tips:  

1. All RecyclerView made in activity/fragment use the same CommonAdapter.
2. This recyclerView allows you to implement the viewholer clickevent in activity/fragment instead of each viewholer (Demo Code will show the sample)
3. Data packed in each viewholer should implements BaseModel to get the function getType(), which would be the key for getting the certain viewHolder.


###  For example :
