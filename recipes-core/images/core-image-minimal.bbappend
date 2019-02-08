#This is to add to the core-image-minimal
#our application ie we are now extending the
#core-image-minimal to include our applications

#Here the bbexample is the recipe that eventually
#generates our executable file which is also named
#bbexample 

#IMAGE_INSTALL +="bbexample"
#
#One of my custom applications is myhellocosmas under the
#same .bb name but it generates an executable called hellocosmas
#This is the application that we will install

IMAGE_INSTALL +="hellocosmas"

