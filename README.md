Group4Shop

Members:

Erik Forsberg: 9005213815 - erikforsberg90@gmail.com
David Oskarsson: 8709044971 - gusoskada@student.gu.se
Emil Bogren 9112062154 - emil.bogren@fripost.org
Christian Svensson - 9007290555 - crillesvensson22@gmail.com

This is a generic webshop. Generic in a way that more than one type of product can easily be adapted by the system by just defining the different categories that you need. We have implemented most of the basic functionality such as browsing products, sorting, adding products to a cart, simulated checkout and payment of items in the shopping cart. There are also some other functionality such as an email contact form, receipt printing as pdf (although not fully functional at the moment).

We have also implemented an administrator part. This application manages the webshop. Adding, editing and removing products. Listing users (admins and regular user). Sending news letter to registered emails are also possible.

The system is implemented in a way that the application and admin parts only know about the interface IGroup4Shop (this is the only connection between the application - model and admin - model). The admin and application does not i anyway know about each other. They only interact thorugh the database.

Things that work:

app side;
- Browsing products
- Register user
- Filtering
- Sorting (somewhat functional)
- Adding products to a cart
- Contact via email form
- Login as user
- Buying products (creating purchaseorder)
- Create reciept (somewhat functional)

admin side;
- adding products
- editing products
- deleting products
- listing users
- list admins
- Creating new admins
- Send email newsletter



Currently not working:

app side;
- Pictures not displaying properly
- Edit personal info
- Buy button in detailed product view
- About page
- Blog page 

