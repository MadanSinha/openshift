## MiniKube for local development 

**Step-1.**  
    Need to install the chocolatey
    https://chocolatey.org/install
    Copy the command and run using the windows power shell or administer mode

Cmd:
    
        Choco
        Choco -?

---

**Step-2.**  
    Need to install the kubectl in local **Note** if  you have latest docker dasktop install then no need to install kubectl additionally 


Cmd:

     Choco install kubernetes-cli

---

**Step-3.**  
Need to install minikube in local

Cmd:

        Choco install minikube

        Systeminfo(enable hyper-v in local)

        Minikube start --driver=hyperv

        Minikube start --driver=docker

        Minikube start

        Minikube status

        Minikube dashboard

        Minikube stop

        Minikube delete