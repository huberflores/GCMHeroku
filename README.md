GCM in Heroku
============

Ready to deploy in Heroku - Google Cloud Messaging (GCM)


Requirements
==========

- JDK > 1.8

- Ruby


Installation
============

- Create a free heroku account at https://id.heroku.com/login

- Install Heroku toolbelt

```xml
$ wget -O- https://toolbelt.heroku.com/install-ubuntu.sh | sh 

$ git clone https://github.com/huberflores/GCMHeroku.git

$ cd GCMHeroku
```

- Set GCM key from google console https://console.developers.google.com/

```xml
$ heroku create

$ git push heroku master
```
