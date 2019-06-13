# KotlinRecyclerViewLikePlaystore
Kotlin with full MVVM architecture 

Major libraries
  - Kotlin
  - Android Architecture Components (ViewModel, LiveData, Room)
  - Dagger2
  - Retrofit
  - RxJava
  - Glide
<img src="https://github.com/piseysen/KotlinRecyclerViewLikePlaystore/blob/master/1_zQ8lmPudBJ1sdtzlkbaA7Q.png"/>

3 Major parts to config project with Dagger2:
1. A Module that contains what you want it to be injected(Annotated with @Module and contains method annotated with @Provides)
2. A Component which consist the modules mentioned above and also Targets that it should be injected into
3. An Application class that holds reference to the Component class

<h2>Example: that use this architecture </hr> 
https://play.google.com/store/apps/details?id=com.kh.picturedictionary
<br/>
<img src="https://lh3.googleusercontent.com/soIGyy-BgGUiOnO77LIkxf_IxeOCB_AE74PT1ZCpMAfs7DYbWrMwtlRluINd5KXzyPQ=w2560-h1378-rw"/>
