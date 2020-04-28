<<<<<<< HEAD
=======
Last login: Mon Apr 27 14:16:55 on ttys000
hemanthkota@Hemanths-MBP ~ % ssh key-gen
ssh: Could not resolve hostname key-gen: nodename nor servname provided, or not known
hemanthkota@Hemanths-MBP ~ % ssh keygen
ssh: Could not resolve hostname keygen: nodename nor servname provided, or not known
hemanthkota@Hemanths-MBP ~ % ssh-keygen
Generating public/private rsa key pair.
Enter file in which to save the key (/Users/hemanthkota/.ssh/id_rsa): 
Enter passphrase (empty for no passphrase): 
Enter same passphrase again: 
Your identification has been saved in /Users/hemanthkota/.ssh/id_rsa.
Your public key has been saved in /Users/hemanthkota/.ssh/id_rsa.pub.
The key fingerprint is:
SHA256:rNyke2Yhz+NVxNxmpH/ZMRBbitZ3yFUOdiVFs3Pvm0o hemanthkota@Hemanths-MBP.lan
The key's randomart image is:
+---[RSA 2048]----+
|             o*=X|
|           oo*=Bo|
|           o=+**+|
|       .  .. +. X|
|        S   . ..+|
|     ..=.  .   o |
|      ++...  E  .|
|       .B.  .   o|
|      .=..   ..o |
+----[SHA256]-----+
hemanthkota@Hemanths-MBP ~ % ls -al
total 136
drwxr-xr-x+  28 hemanthkota  staff    896 Apr 27 14:18 .
drwxr-xr-x    5 root         admin    160 Dec  5 02:21 ..
-r--------    1 hemanthkota  staff      7 Dec 16 15:17 .CFUserTextEncoding
-rw-r--r--@   1 hemanthkota  staff  10244 Apr 26 09:53 .DS_Store
drwx------   28 hemanthkota  staff    896 Apr  9 15:02 .Trash
drwxrwxrwx   11 hemanthkota  staff    352 Mar 12 16:42 .anydesk
-rw-------    1 hemanthkota  staff   3372 Jan  6 13:23 .bash_history
drwx------   62 hemanthkota  staff   1984 Jan  6 13:23 .bash_sessions
drwx------    3 hemanthkota  staff     96 Jan 19 18:02 .cups
drwx------    5 hemanthkota  staff    160 Apr 27 14:19 .ssh
drwxr-xr-x    9 hemanthkota  staff    288 Jan 17 10:23 .vagrant.d
drwxr-xr-x    3 hemanthkota  staff     96 Jan 14 18:50 .vim
-rw-------    1 hemanthkota  staff  11330 Jan 16 15:30 .viminfo
drwxr-xr-x    4 hemanthkota  staff    128 Dec 18 19:10 .vscode
-rw-------    1 hemanthkota  staff   4231 Apr 27 14:17 .zsh_history
drwx------@   3 hemanthkota  staff     96 Jan  3 17:24 Applications
drwxrwxr-x@   4 hemanthkota  staff    128 Apr 27 09:30 Creative Cloud Files
drwx------@   8 hemanthkota  staff    256 Apr 27 12:09 Desktop
drwx------+  12 hemanthkota  staff    384 Mar 17 17:04 Documents
drwx------@ 119 hemanthkota  staff   3808 Apr 26 09:55 Downloads
drwx------@  75 hemanthkota  staff   2400 Apr 18 23:16 Library
drwx------+   4 hemanthkota  staff    128 Dec 21 15:01 Movies
drwx------+   4 hemanthkota  staff    128 Jan  4 12:10 Music
drwx------+   5 hemanthkota  staff    160 Dec 23 18:42 Pictures
drwxr-xr-x+   5 hemanthkota  staff    160 Dec 18 18:48 Public
-rw-r--r--@   1 hemanthkota  staff  25309 Feb 25 14:35 ReadMe.pdf
drwx------    6 hemanthkota  staff    192 Jan 16 15:26 VirtualBox VMs
drwxr-xr-x    4 hemanthkota  staff    128 Jan 16 15:22 vagrant
hemanthkota@Hemanths-MBP ~ % cd .ssh
hemanthkota@Hemanths-MBP .ssh % ls -al
total 40
drwx------   5 hemanthkota  staff   160 Apr 27 14:19 .
drwxr-xr-x+ 28 hemanthkota  staff   896 Apr 27 14:18 ..
-rw-------   1 hemanthkota  staff  1843 Apr 27 14:19 id_rsa
-rw-r--r--   1 hemanthkota  staff   410 Apr 27 14:19 id_rsa.pub
-rw-r--r--   1 hemanthkota  staff  8433 Mar 16 16:07 known_hosts
hemanthkota@Hemanths-MBP .ssh % cat id_rsa.pub
ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDZ+uikXhJHNTtOroISqCMZYni5ye05rg2HUvX1NErId+Pk3/QvdNAePLf4lUe9HUn3Vb423oY2QsHi/Bwc3tMsFs02xfM/d+nJ/VaBYsy+B8a80AHAdjASODJifAndlHtu19GkZtZY1XiZZFoyWornZTMbWgWCjXaU7N26yy3ms8E2xL4VisDFcR5S+nKTdZttzuRDyVpAMrapQWwA2QJfxC2lnzhWbETFQ4NdAB+gb38DBa2CLVIEhsE8K2P1n0ZaIBFpk3ysO3MnQp0FgQyDUxHX8dfeUKVFq677v3jgOdLhAwzxUv2SG8ETjDv6YA26kevWzh5jMMYivCx9S0wx hemanthkota@Hemanths-MBP.lan
hemanthkota@Hemanths-MBP .ssh % vim id_rsa.pub
hemanthkota@Hemanths-MBP .ssh % cd ..
hemanthkota@Hemanths-MBP ~ % ls
Applications		Library			ReadMe.pdf
Creative Cloud Files	Movies			VirtualBox VMs
Desktop			Music			vagrant
Documents		Pictures
Downloads		Public
hemanthkota@Hemanths-MBP ~ % cd Desktop 
hemanthkota@Hemanths-MBP Desktop % mkdir git
hemanthkota@Hemanths-MBP Desktop % cd git
hemanthkota@Hemanths-MBP git % pwd
/Users/hemanthkota/Desktop/git
hemanthkota@Hemanths-MBP git % ls -al
total 0
drwxr-xr-x  2 hemanthkota  staff   64 Apr 27 14:23 .
drwx------@ 9 hemanthkota  staff  288 Apr 27 14:23 ..
hemanthkota@Hemanths-MBP git % git@github.com:hkota69725/cicd-pipeline-train-schedule-cd.git
zsh: no such file or directory: git@github.com:hkota69725/cicd-pipeline-train-schedule-cd.git
hemanthkota@Hemanths-MBP git % git clone git@github.com:hkota69725/cicd-pipeline-train-schedule-cd.git
xcrun: error: invalid active developer path (/Library/Developer/CommandLineTools), missing xcrun at: /Library/Developer/CommandLineTools/usr/bin/xcrun
hemanthkota@Hemanths-MBP git % pwd 
/Users/hemanthkota/Desktop/git
hemanthkota@Hemanths-MBP git %  xcode-select --install
xcode-select: note: install requested for command line developer tools
hemanthkota@Hemanths-MBP git % git@github.com:hkota69725/cicd-pipeline-train-schedule-cd.git
zsh: no such file or directory: git@github.com:hkota69725/cicd-pipeline-train-schedule-cd.git
hemanthkota@Hemanths-MBP git % ls
hemanthkota@Hemanths-MBP git % ls -al
total 0
drwxr-xr-x  2 hemanthkota  staff   64 Apr 27 14:23 .
drwx------@ 9 hemanthkota  staff  288 Apr 27 14:23 ..
hemanthkota@Hemanths-MBP git % git clone git@github.com:hkota69725/cicd-pipeline-train-schedule-cd.git
Cloning into 'cicd-pipeline-train-schedule-cd'...
The authenticity of host 'github.com (140.82.114.4)' can't be established.
RSA key fingerprint is SHA256:nThbg6kXUpJWGl7E1IGOCspRomTxdCARLviKw6E5SY8.
Are you sure you want to continue connecting (yes/no)? yes
Warning: Permanently added 'github.com,140.82.114.4' (RSA) to the list of known hosts.
remote: Enumerating objects: 50, done.
remote: Total 50 (delta 0), reused 0 (delta 0), pack-reused 50
Receiving objects: 100% (50/50), 90.54 KiB | 730.00 KiB/s, done.
Resolving deltas: 100% (10/10), done.
hemanthkota@Hemanths-MBP git % ls
cicd-pipeline-train-schedule-cd
hemanthkota@Hemanths-MBP git % cd cicd-pipeline-train-schedule-cd 
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls -al
total 400
drwxr-xr-x  20 hemanthkota  staff     640 Apr 27 14:33 .
drwxr-xr-x   3 hemanthkota  staff      96 Apr 27 14:33 ..
drwxr-xr-x  12 hemanthkota  staff     384 Apr 27 14:33 .git
-rw-r--r--   1 hemanthkota  staff      26 Apr 27 14:33 .gitignore
-rw-r--r--   1 hemanthkota  staff    1763 Apr 27 14:33 Jenkinsfile
-rw-r--r--   1 hemanthkota  staff     467 Apr 27 14:33 README.md
-rw-r--r--   1 hemanthkota  staff    1079 Apr 27 14:33 app.js
drwxr-xr-x   3 hemanthkota  staff      96 Apr 27 14:33 bin
-rw-r--r--   1 hemanthkota  staff     667 Apr 27 14:33 build.gradle
drwxr-xr-x   3 hemanthkota  staff      96 Apr 27 14:33 data
drwxr-xr-x   3 hemanthkota  staff      96 Apr 27 14:33 gradle
-rwxr-xr-x   1 hemanthkota  staff    5296 Apr 27 14:33 gradlew
-rw-r--r--   1 hemanthkota  staff    2260 Apr 27 14:33 gradlew.bat
-rw-r--r--   1 hemanthkota  staff  160017 Apr 27 14:33 package-lock.json
-rw-r--r--   1 hemanthkota  staff     482 Apr 27 14:33 package.json
drwxr-xr-x   4 hemanthkota  staff     128 Apr 27 14:33 public
drwxr-xr-x   4 hemanthkota  staff     128 Apr 27 14:33 routes
-rw-r--r--   1 hemanthkota  staff     383 Apr 27 14:33 settings.gradle
drwxr-xr-x   3 hemanthkota  staff      96 Apr 27 14:33 test
drwxr-xr-x   5 hemanthkota  staff     160 Apr 27 14:33 views
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git branch
* master
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git checkout
Your branch is up to date with 'origin/master'.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % clear

hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git branch feature
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git brachs
git: 'brachs' is not a git command. See 'git --help'.

The most similar command is
	branch
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git branches
git: 'branches' is not a git command. See 'git --help'.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git branch  
  feature
* master
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git checkout feature
Switched to branch 'feature'
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git branch
* feature
  master
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls -al
total 400
drwxr-xr-x  20 hemanthkota  staff     640 Apr 27 14:33 .
drwxr-xr-x   3 hemanthkota  staff      96 Apr 27 14:33 ..
drwxr-xr-x  12 hemanthkota  staff     384 Apr 27 14:55 .git
-rw-r--r--   1 hemanthkota  staff      26 Apr 27 14:33 .gitignore
-rw-r--r--   1 hemanthkota  staff    1763 Apr 27 14:33 Jenkinsfile
-rw-r--r--   1 hemanthkota  staff     467 Apr 27 14:33 README.md
-rw-r--r--   1 hemanthkota  staff    1079 Apr 27 14:33 app.js
drwxr-xr-x   3 hemanthkota  staff      96 Apr 27 14:33 bin
-rw-r--r--   1 hemanthkota  staff     667 Apr 27 14:33 build.gradle
drwxr-xr-x   3 hemanthkota  staff      96 Apr 27 14:33 data
drwxr-xr-x   3 hemanthkota  staff      96 Apr 27 14:33 gradle
-rwxr-xr-x   1 hemanthkota  staff    5296 Apr 27 14:33 gradlew
-rw-r--r--   1 hemanthkota  staff    2260 Apr 27 14:33 gradlew.bat
-rw-r--r--   1 hemanthkota  staff  160017 Apr 27 14:33 package-lock.json
-rw-r--r--   1 hemanthkota  staff     482 Apr 27 14:33 package.json
drwxr-xr-x   4 hemanthkota  staff     128 Apr 27 14:33 public
drwxr-xr-x   4 hemanthkota  staff     128 Apr 27 14:33 routes
-rw-r--r--   1 hemanthkota  staff     383 Apr 27 14:33 settings.gradle
drwxr-xr-x   3 hemanthkota  staff      96 Apr 27 14:33 test
drwxr-xr-x   5 hemanthkota  staff     160 Apr 27 14:33 views
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % touch 1.html 2.html
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls
1.html			README.md		build.gradle		gradlew			package.json		settings.gradle
2.html			app.js			data			gradlew.bat		public			test
Jenkinsfile		bin			gradle			package-lock.json	routes			views
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git add .
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git log
commit 9f7f70ce3da2b75a555c7735c33e7cc07e503dce (HEAD -> feature, origin/master, origin/HEAD, master)
Author: hkota69725 <46402752+hkota69725@users.noreply.github.com>
Date:   Mon Jan 20 15:06:02 2020 -0600

    Update Jenkinsfile

commit fd3a791f70518e6c73ab140c44d92e8b8f653547
Author: hkota69725 <46402752+hkota69725@users.noreply.github.com>
Date:   Mon Jan 20 15:02:53 2020 -0600

    adding staging

commit ec370d8189a5c1859aba8691c112b3fe604da311
Author: willb <willb@linuxacademy.com>
Date:   Wed May 2 15:50:40 2018 -0400

    fix readme

commit ed7be05434023c83b269a672b70b5526a7f6ffe8
Author: willb <willb@linuxacademy.com>
Date:   Fri Apr 27 13:21:05 2018 -0400

    initialize project
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git status
On branch feature
Changes to be committed:
  (use "git restore --staged <file>..." to unstage)
	new file:   1.html
	new file:   2.html

hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git commit -m "added html files"
[feature 9dab14e] added html files
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 2 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 1.html
 create mode 100644 2.html
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git status                      
On branch feature
nothing to commit, working tree clean
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git push
fatal: The current branch feature has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin feature

hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git push --set-upstream origin feature
Warning: Permanently added the RSA host key for IP address '140.82.112.3' to the list of known hosts.
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 285 bytes | 285.00 KiB/s, done.
Total 3 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'feature' on GitHub by visiting:
remote:      https://github.com/hkota69725/cicd-pipeline-train-schedule-cd/pull/new/feature
remote: 
To github.com:hkota69725/cicd-pipeline-train-schedule-cd.git
 * [new branch]      feature -> feature
Branch 'feature' set up to track remote branch 'feature' from 'origin'.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls
1.html			README.md		build.gradle		gradlew			package.json		settings.gradle
2.html			app.js			data			gradlew.bat		public			test
Jenkinsfile		bin			gradle			package-lock.json	routes			views
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % vim 2.html 
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git add .
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git commit -m "added content to 2.html"
[feature 97c030e] added content to 2.html
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 4 insertions(+)
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git commit -m "added content to 2.html"
On branch feature
Your branch is ahead of 'origin/feature' by 1 commit.
  (use "git push" to publish your local commits)

nothing to commit, working tree clean
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git push
Warning: Permanently added the RSA host key for IP address '140.82.114.3' to the list of known hosts.
To github.com:hkota69725/cicd-pipeline-train-schedule-cd.git
 ! [rejected]        feature -> feature (fetch first)
error: failed to push some refs to 'git@github.com:hkota69725/cicd-pipeline-train-schedule-cd.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git pull
Warning: Permanently added the RSA host key for IP address '140.82.113.4' to the list of known hosts.
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), done.
From github.com:hkota69725/cicd-pipeline-train-schedule-cd
   9dab14e..f32d152  feature    -> origin/feature
Merge made by the 'recursive' strategy.
 1.html | 5 +++++
 1 file changed, 5 insertions(+)
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls  
1.html			README.md		build.gradle		gradlew			package.json		settings.gradle
2.html			app.js			data			gradlew.bat		public			test
Jenkinsfile		bin			gradle			package-lock.json	routes			views
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % cat 1.html 
html1
html2
html3
html4
html5
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git logs --oneline 
git: 'logs' is not a git command. See 'git --help'.

The most similar command is
	log
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git log --oneline 
403527e (HEAD -> feature) Merge branch 'feature' of github.com:hkota69725/cicd-pipeline-train-schedule-cd into feature to update the repo in my local
97c030e added content to 2.html
f32d152 (origin/feature) Update 1.html
9dab14e added html files
9f7f70c (origin/master, origin/HEAD, master) Update Jenkinsfile
fd3a791 adding staging
ec370d8 fix readme
ed7be05 initialize project
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git push
Enumerating objects: 9, done.
Counting objects: 100% (8/8), done.
Delta compression using up to 8 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (5/5), 642 bytes | 642.00 KiB/s, done.
Total 5 (delta 2), reused 0 (delta 0)
remote: Resolving deltas: 100% (2/2), completed with 1 local object.
To github.com:hkota69725/cicd-pipeline-train-schedule-cd.git
   f32d152..403527e  feature -> feature
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git log --oneline
403527e (HEAD -> feature, origin/feature) Merge branch 'feature' of github.com:hkota69725/cicd-pipeline-train-schedule-cd into feature to update the repo in my local
97c030e added content to 2.html
f32d152 Update 1.html
9dab14e added html files
9f7f70c (origin/master, origin/HEAD, master) Update Jenkinsfile
fd3a791 adding staging
ec370d8 fix readme
ed7be05 initialize project
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % clear

hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls
1.html			README.md		build.gradle		gradlew			package.json		settings.gradle
2.html			app.js			data			gradlew.bat		public			test
Jenkinsfile		bin			gradle			package-lock.json	routes			views
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git merge
Already up to date.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git checkout maSTER
Switched to branch 'maSTER'
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git branch
  feature
  master
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls
Jenkinsfile		app.js			build.gradle		gradle			gradlew.bat		package.json		routes			test
README.md		bin			data			gradlew			package-lock.json	public			settings.gradle		views
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git merge
fatal: No remote for the current branch.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git merge feature
Updating 9f7f70c..403527e
Fast-forward
 1.html | 5 +++++
 2.html | 4 ++++
 2 files changed, 9 insertions(+)
 create mode 100644 1.html
 create mode 100644 2.html
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls
1.html			README.md		build.gradle		gradlew			package.json		settings.gradle
2.html			app.js			data			gradlew.bat		public			test
Jenkinsfile		bin			gradle			package-lock.json	routes			views
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git branch
  feature
  master
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git checkout master
Switched to branch 'master'
Your branch is ahead of 'origin/master' by 4 commits.
  (use "git push" to publish your local commits)
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls  
1.html			README.md		build.gradle		gradlew			package.json		settings.gradle
2.html			app.js			data			gradlew.bat		public			test
Jenkinsfile		bin			gradle			package-lock.json	routes			views
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git log --oneline
403527e (HEAD -> master, origin/feature, feature) Merge branch 'feature' of github.com:hkota69725/cicd-pipeline-train-schedule-cd into feature to update the repo in my local
97c030e added content to 2.html
f32d152 Update 1.html
9dab14e added html files
9f7f70c (origin/master, origin/HEAD) Update Jenkinsfile
fd3a791 adding staging
ec370d8 fix readme
ed7be05 initialize project
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % touch 1.txt                
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git add .
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git commit -m "added 1 file"
[master d4598c4] added 1 file
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 1.txt
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % touch 2.txt                 
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git add .                   
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git commit -m "added 1 file"
[master b80185d] added 1 file
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 2.txt
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % touch 3.txt                 
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git add .                   
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git commit -m "added 1 file"
[master 57cdfc1] added 1 file
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 3.txt
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git log --oneline
57cdfc1 (HEAD -> master) added 1 file
b80185d added 1 file
d4598c4 added 1 file
403527e (origin/feature, feature) Merge branch 'feature' of github.com:hkota69725/cicd-pipeline-train-schedule-cd into feature to update the repo in my local
97c030e added content to 2.html
f32d152 Update 1.html
9dab14e added html files
9f7f70c (origin/master, origin/HEAD) Update Jenkinsfile
fd3a791 adding staging
ec370d8 fix readme
ed7be05 initialize project
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git merge master feature
Already up to date.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git merge feature master
Already up to date.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git checkout feature
Switched to branch 'feature'
Your branch is up to date with 'origin/feature'.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls
1.html			README.md		build.gradle		gradlew			package.json		settings.gradle
2.html			app.js			data			gradlew.bat		public			test
Jenkinsfile		bin			gradle			package-lock.json	routes			views
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git merge master
Updating 403527e..57cdfc1
Fast-forward
 1.txt | 0
 2.txt | 0
 3.txt | 0
 3 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 1.txt
 create mode 100644 2.txt
 create mode 100644 3.txt
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls
1.html			2.txt			README.md		build.gradle		gradlew			package.json		settings.gradle
1.txt			3.txt			app.js			data			gradlew.bat		public			test
2.html			Jenkinsfile		bin			gradle			package-lock.json	routes			views
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git log --oneline
57cdfc1 (HEAD -> feature, master) added 1 file
b80185d added 1 file
d4598c4 added 1 file
403527e (origin/feature) Merge branch 'feature' of github.com:hkota69725/cicd-pipeline-train-schedule-cd into feature to update the repo in my local
97c030e added content to 2.html
f32d152 Update 1.html
9dab14e added html files
9f7f70c (origin/master, origin/HEAD) Update Jenkinsfile
fd3a791 adding staging
ec370d8 fix readme
ed7be05 initialize project
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % touch 1.cs 
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git add
Nothing specified, nothing added.
Maybe you wanted to say 'git add .'?
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git add .
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git commit -m "addes 1.cs" 
[feature f593db7] addes 1.cs
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 1.cs
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % touch 2.cs                
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git add .                 
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git commit -m "addes 2.cs"
[feature 37efa47] addes 2.cs
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 2.cs
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % touch 3.cs                
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git add .                 
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git commit -m "addes 3.cs"
[feature c519774] addes 3.cs
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 3.cs
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git log --oneline
c519774 (HEAD -> feature) addes 3.cs
37efa47 addes 2.cs
f593db7 addes 1.cs
57cdfc1 (master) added 1 file
b80185d added 1 file
d4598c4 added 1 file
403527e (origin/feature) Merge branch 'feature' of github.com:hkota69725/cicd-pipeline-train-schedule-cd into feature to update the repo in my local
97c030e added content to 2.html
f32d152 Update 1.html
9dab14e added html files
9f7f70c (origin/master, origin/HEAD) Update Jenkinsfile
fd3a791 adding staging
ec370d8 fix readme
ed7be05 initialize project
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git branch
* feature
  master
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git rebase
Current branch feature is up to date.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git rebase master
Current branch feature is up to date.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git checkout master
Switched to branch 'master'
Your branch is ahead of 'origin/master' by 7 commits.
  (use "git push" to publish your local commits)
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git rebase feature 
First, rewinding head to replay your work on top of it...
Fast-forwarded master to feature.
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git log --oneline
c519774 (HEAD -> master, feature) addes 3.cs
37efa47 addes 2.cs
f593db7 addes 1.cs
57cdfc1 added 1 file
b80185d added 1 file
d4598c4 added 1 file
403527e (origin/feature) Merge branch 'feature' of github.com:hkota69725/cicd-pipeline-train-schedule-cd into feature to update the repo in my local
97c030e added content to 2.html
f32d152 Update 1.html
9dab14e added html files
9f7f70c (origin/master, origin/HEAD) Update Jenkinsfile
fd3a791 adding staging
ec370d8 fix readme
ed7be05 initialize project
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % touch 3.db 4.db 5.db
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git add .
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git commit -m "addes db files"
[master cc39ca3] addes db files
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 3 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 3.db
 create mode 100644 4.db
 create mode 100644 5.db
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git rebase
First, rewinding head to replay your work on top of it...
Applying: added html files
Applying: added content to 2.html
Applying: Update 1.html
Applying: added 1 file
Applying: added 1 file
Applying: added 1 file
Applying: addes 1.cs
Applying: addes 2.cs
Applying: addes 3.cs
Applying: addes db files
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git log --oneline
417917f (HEAD -> master) addes db files
efca381 addes 3.cs
c65fc2c addes 2.cs
47f2aa1 addes 1.cs
2379973 added 1 file
dd6e41e added 1 file
98289bc added 1 file
3e27267 Update 1.html
0c959a1 added content to 2.html
aeb93c9 added html files
9f7f70c (origin/master, origin/HEAD) Update Jenkinsfile
fd3a791 adding staging
ec370d8 fix readme
ed7be05 initialize project
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git branch
  feature
* master
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git checkout feature
Switched to branch 'feature'
Your branch is ahead of 'origin/feature' by 6 commits.
  (use "git push" to publish your local commits)
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git log --oneline
c519774 (HEAD -> feature) addes 3.cs
37efa47 addes 2.cs
f593db7 addes 1.cs
57cdfc1 added 1 file
b80185d added 1 file
d4598c4 added 1 file
403527e (origin/feature) Merge branch 'feature' of github.com:hkota69725/cicd-pipeline-train-schedule-cd into feature to update the repo in my local
97c030e added content to 2.html
f32d152 Update 1.html
9dab14e added html files
9f7f70c (origin/master, origin/HEAD) Update Jenkinsfile
fd3a791 adding staging
ec370d8 fix readme
ed7be05 initialize project
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git merge master
Merge made by the 'recursive' strategy.
 3.db | 0
 4.db | 0
 5.db | 0
 3 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 3.db
 create mode 100644 4.db
 create mode 100644 5.db
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git branch
* feature
  master
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git log --oneline
13211d7 (HEAD -> feature) Merge branch 'master' into feature adding db files from master to feature .
417917f (master) addes db files
efca381 addes 3.cs
c65fc2c addes 2.cs
47f2aa1 addes 1.cs
2379973 added 1 file
dd6e41e added 1 file
98289bc added 1 file
3e27267 Update 1.html
0c959a1 added content to 2.html
aeb93c9 added html files
c519774 addes 3.cs
37efa47 addes 2.cs
f593db7 addes 1.cs
57cdfc1 added 1 file
b80185d added 1 file
d4598c4 added 1 file
403527e (origin/feature) Merge branch 'feature' of github.com:hkota69725/cicd-pipeline-train-schedule-cd into feature to update the repo in my local
97c030e added content to 2.html
f32d152 Update 1.html
9dab14e added html files
9f7f70c (origin/master, origin/HEAD) Update Jenkinsfile
fd3a791 adding staging
ec370d8 fix readme
ed7be05 initialize project
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % ls
1.cs			2.html			3.txt			README.md		data			package-lock.json	settings.gradle
1.html			2.txt			4.db			app.js			gradle			package.json		test
1.txt			3.cs			5.db			bin			gradlew			public			views
2.cs			3.db			Jenkinsfile		build.gradle		gradlew.bat		routes
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git push
Enumerating objects: 29, done.
Counting objects: 100% (29/29), done.
Delta compression using up to 8 threads
Compressing objects: 100% (26/26), done.
Writing objects: 100% (27/27), 2.71 KiB | 1.36 MiB/s, done.
Total 27 (delta 16), reused 0 (delta 0)
remote: Resolving deltas: 100% (16/16), completed with 1 local object.
To github.com:hkota69725/cicd-pipeline-train-schedule-cd.git
   403527e..13211d7  feature -> feature
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git checkout master
Switched to branch 'master'
Your branch is ahead of 'origin/master' by 10 commits.
  (use "git push" to publish your local commits)
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % git push
Total 0 (delta 0), reused 0 (delta 0)
To github.com:hkota69725/cicd-pipeline-train-schedule-cd.git
   9f7f70c..417917f  master -> master
hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % clear

hemanthkota@Hemanths-MBP cicd-pipeline-train-schedule-cd % cd ..
hemanthkota@Hemanths-MBP git % ls
cicd-pipeline-train-schedule-cd
hemanthkota@Hemanths-MBP git % git clone
fatal: You must specify a repository to clone.

usage: git clone [<options>] [--] <repo> [<dir>]

    -v, --verbose         be more verbose
    -q, --quiet           be more quiet
    --progress            force progress reporting
    -n, --no-checkout     don't create a checkout
    --bare                create a bare repository
    --mirror              create a mirror repository (implies bare)
    -l, --local           to clone from a local repository
    --no-hardlinks        don't use local hardlinks, always copy
    -s, --shared          setup as shared repository
    --recursive ...       alias of --recurse-submodules
    --recurse-submodules[=<pathspec>]
                          initialize submodules in the clone
    -j, --jobs <n>        number of submodules cloned in parallel
    --template <template-directory>
                          directory from which templates will be used
    --reference <repo>    reference repository
    --reference-if-able <repo>
                          reference repository
    --dissociate          use --reference only while cloning
    -o, --origin <name>   use <name> instead of 'origin' to track upstream
    -b, --branch <branch>
                          checkout <branch> instead of the remote's HEAD
    -u, --upload-pack <path>
                          path to git-upload-pack on the remote
    --depth <depth>       create a shallow clone of that depth
    --shallow-since <time>
                          create a shallow clone since a specific time
    --shallow-exclude <revision>
                          deepen history of shallow clone, excluding rev
    --single-branch       clone only one branch, HEAD or --branch
    --no-tags             don't clone any tags, and make later fetches not to follow them
    --shallow-submodules  any cloned submodules will be shallow
    --separate-git-dir <gitdir>
                          separate git dir from working tree
    -c, --config <key=value>
                          set config inside the new repository
    --server-option <server-specific>
                          option to transmit
    -4, --ipv4            use IPv4 addresses only
    -6, --ipv6            use IPv6 addresses only
    --filter <args>       object filtering
    --remote-submodules   any cloned submodules will use their remote-tracking branch

hemanthkota@Hemanths-MBP git % git clone git@github.com:hkota69725/hemanth.-dattu.git
Cloning into 'hemanth.-dattu'...
warning: You appear to have cloned an empty repository.
hemanthkota@Hemanths-MBP git % ls
cicd-pipeline-train-schedule-cd	hemanth.-dattu
hemanthkota@Hemanths-MBP git % cd hemanth.-dattu 
hemanthkota@Hemanths-MBP hemanth.-dattu % ls
hemanthkota@Hemanths-MBP hemanth.-dattu % ls -al
total 0
drwxr-xr-x  3 hemanthkota  staff   96 Apr 27 16:46 .
drwxr-xr-x  4 hemanthkota  staff  128 Apr 27 16:46 ..
drwxr-xr-x  9 hemanthkota  staff  288 Apr 27 16:46 .git
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch
hemanthkota@Hemanths-MBP hemanth.-dattu % git push -u origin master
error: src refspec master does not match any
error: failed to push some refs to 'git@github.com:hkota69725/hemanth.-dattu.git'
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch master
fatal: Not a valid object name: 'master'.
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch chekout master
fatal: Not a valid object name: 'master'.
hemanthkota@Hemanths-MBP hemanth.-dattu % git pull
Warning: Permanently added the RSA host key for IP address '140.82.112.4' to the list of known hosts.
remote: Enumerating objects: 5, done.
remote: Counting objects: 100% (5/5), done.
remote: Compressing objects: 100% (2/2), done.
remote: Total 5 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (5/5), done.
From github.com:hkota69725/hemanth.-dattu
 * [new branch]      master     -> origin/master
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch
* master
hemanthkota@Hemanths-MBP hemanth.-dattu % git log
commit 0dbeb9ca0ad84ae57c917e481f36d921484318ec (HEAD -> master, origin/master)
Author: hkota69725 <46402752+hkota69725@users.noreply.github.com>
Date:   Mon Apr 27 16:49:59 2020 -0500

    Delete Initial

commit 7b8bf7fd5d58ae0339b615dd83bd59a117a8eb76
Author: hkota69725 <46402752+hkota69725@users.noreply.github.com>
Date:   Mon Apr 27 16:49:44 2020 -0500

    Create Initial
    
    kjbasdc aks
hemanthkota@Hemanths-MBP hemanth.-dattu % clear

hemanthkota@Hemanths-MBP hemanth.-dattu % ls
hemanthkota@Hemanths-MBP hemanth.-dattu % pwd
/Users/hemanthkota/Desktop/git/hemanth.-dattu
hemanthkota@Hemanths-MBP hemanth.-dattu % l -al
zsh: command not found: l
hemanthkota@Hemanths-MBP hemanth.-dattu % ls -al
total 0
drwxr-xr-x   3 hemanthkota  staff   96 Apr 27 16:46 .
drwxr-xr-x   4 hemanthkota  staff  128 Apr 27 16:46 ..
drwxr-xr-x  12 hemanthkota  staff  384 Apr 27 16:50 .git
hemanthkota@Hemanths-MBP hemanth.-dattu % clear




















































hemanthkota@Hemanths-MBP hemanth.-dattu % touch 1.cs 2.cs 3.cs 4.cs 5.cs 6.cs
hemanthkota@Hemanths-MBP hemanth.-dattu % git add.   
\git: 'add.' is not a git command. See 'git --help'.

The most similar command is
	add
hemanthkota@Hemanths-MBP hemanth.-dattu % git add .
hemanthkota@Hemanths-MBP hemanth.-dattu % fit stash
zsh: command not found: fit
hemanthkota@Hemanths-MBP hemanth.-dattu % git stash
Saved working directory and index state WIP on master: 0dbeb9c Delete Initial
hemanthkota@Hemanths-MBP hemanth.-dattu % git status
On branch master
Your branch is up to date with 'origin/master'.

nothing to commit, working tree clean
hemanthkota@Hemanths-MBP hemanth.-dattu % git stash
No local changes to save
hemanthkota@Hemanths-MBP hemanth.-dattu % ls 
hemanthkota@Hemanths-MBP hemanth.-dattu % touch 1.cs 2.cs 3.cs 4.cs 5.cs 6.cs
hemanthkota@Hemanths-MBP hemanth.-dattu % git add .
hemanthkota@Hemanths-MBP hemanth.-dattu % git commit -m "adding .cs files"
[master 69b0fcf] adding .cs files
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 6 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 1.cs
 create mode 100644 2.cs
 create mode 100644 3.cs
 create mode 100644 4.cs
 create mode 100644 5.cs
 create mode 100644 6.cs
hemanthkota@Hemanths-MBP hemanth.-dattu % git stash
No local changes to save
hemanthkota@Hemanths-MBP hemanth.-dattu % ls
1.cs	2.cs	3.cs	4.cs	5.cs	6.cs
hemanthkota@Hemanths-MBP hemanth.-dattu % git log
commit 69b0fcff24a9b54970a01a5be7ba900d0231fd2e (HEAD -> master)
Author: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Date:   Mon Apr 27 16:55:19 2020 -0500

    adding .cs files

commit 0dbeb9ca0ad84ae57c917e481f36d921484318ec (origin/master)
Author: hkota69725 <46402752+hkota69725@users.noreply.github.com>
Date:   Mon Apr 27 16:49:59 2020 -0500

    Delete Initial

commit 7b8bf7fd5d58ae0339b615dd83bd59a117a8eb76
Author: hkota69725 <46402752+hkota69725@users.noreply.github.com>
Date:   Mon Apr 27 16:49:44 2020 -0500

    Create Initial
    
    kjbasdc aks
hemanthkota@Hemanths-MBP hemanth.-dattu % git loggit log --oneline
git: 'loggit' is not a git command. See 'git --help'.
hemanthkota@Hemanths-MBP hemanth.-dattu % git log --oneline 
69b0fcf (HEAD -> master) adding .cs files
0dbeb9c (origin/master) Delete Initial
7b8bf7f Create Initial
hemanthkota@Hemanths-MBP hemanth.-dattu % git checkout 0dbeb9c
Note: switching to '0dbeb9c'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by switching back to a branch.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -c with the switch command. Example:

  git switch -c <new-branch-name>

Or undo this operation with:

  git switch -

Turn off this advice by setting config variable advice.detachedHead to false

HEAD is now at 0dbeb9c Delete Initial
hemanthkota@Hemanths-MBP hemanth.-dattu % git ls 
git: 'ls' is not a git command. See 'git --help'.

The most similar command is
	log
hemanthkota@Hemanths-MBP hemanth.-dattu % ls    
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch master
fatal: A branch named 'master' already exists.
hemanthkota@Hemanths-MBP hemanth.-dattu % git checkout master
Previous HEAD position was 0dbeb9c Delete Initial
Switched to branch 'master'
Your branch is ahead of 'origin/master' by 1 commit.
  (use "git push" to publish your local commits)
hemanthkota@Hemanths-MBP hemanth.-dattu % ls
1.cs	2.cs	3.cs	4.cs	5.cs	6.cs
hemanthkota@Hemanths-MBP hemanth.-dattu % clear   

hemanthkota@Hemanths-MBP hemanth.-dattu % lw
zsh: command not found: lw
hemanthkota@Hemanths-MBP hemanth.-dattu % ls
1.cs	2.cs	3.cs	4.cs	5.cs	6.cs
hemanthkota@Hemanths-MBP hemanth.-dattu % gir branch feature
zsh: command not found: gir
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch feature
hemanthkota@Hemanths-MBP hemanth.-dattu % ls
1.cs	2.cs	3.cs	4.cs	5.cs	6.cs
hemanthkota@Hemanths-MBP hemanth.-dattu % git push
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 8 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 266 bytes | 266.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To github.com:hkota69725/hemanth.-dattu.git
   0dbeb9c..69b0fcf  master -> master
hemanthkota@Hemanths-MBP hemanth.-dattu % gir checkout feature
zsh: command not found: gir
hemanthkota@Hemanths-MBP hemanth.-dattu % git checkout feature
Switched to branch 'feature'
hemanthkota@Hemanths-MBP hemanth.-dattu % ls  
1.cs	2.cs	3.cs	4.cs	5.cs	6.cs
hemanthkota@Hemanths-MBP hemanth.-dattu % push
zsh: command not found: push
hemanthkota@Hemanths-MBP hemanth.-dattu % git push
fatal: The current branch feature has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin feature

hemanthkota@Hemanths-MBP hemanth.-dattu % touch 1.html 2.html
hemanthkota@Hemanths-MBP hemanth.-dattu % ls
1.cs	1.html	2.cs	2.html	3.cs	4.cs	5.cs	6.cs
hemanthkota@Hemanths-MBP hemanth.-dattu % git add .
hemanthkota@Hemanths-MBP hemanth.-dattu % git commit -m "added html pages to featured branch"
[feature 02ea881] added html pages to featured branch
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 2 files changed, 0 insertions(+), 0 deletions(-)
 create mode 100644 1.html
 create mode 100644 2.html
hemanthkota@Hemanths-MBP hemanth.-dattu % git push
fatal: The current branch feature has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin feature

hemanthkota@Hemanths-MBP hemanth.-dattu % git push --set-upstream origin master 
Branch 'master' set up to track remote branch 'master' from 'origin'.
Everything up-to-date
hemanthkota@Hemanths-MBP hemanth.-dattu % git push --set-downstream origin master
error: unknown option `set-downstream'
usage: git push [<options>] [<repository> [<refspec>...]]

    -v, --verbose         be more verbose
    -q, --quiet           be more quiet
    --repo <repository>   repository
    --all                 push all refs
    --mirror              mirror all refs
    -d, --delete          delete refs
    --tags                push tags (can't be used with --all or --mirror)
    -n, --dry-run         dry run
    --porcelain           machine-readable output
    -f, --force           force updates
    --force-with-lease[=<refname>:<expect>]
                          require old value of ref to be at this value
    --recurse-submodules[=(check|on-demand|no)]
                          control recursive pushing of submodules
    --thin                use thin pack
    --receive-pack <receive-pack>
                          receive pack program
    --exec <receive-pack>
                          receive pack program
    -u, --set-upstream    set upstream for git pull/status
    --progress            force progress reporting
    --prune               prune locally removed refs
    --no-verify           bypass pre-push hook
    --follow-tags         push missing but relevant tags
    --signed[=(yes|no|if-asked)]
                          GPG sign the push
    --atomic              request atomic transaction on remote side
    -o, --push-option <server-specific>
                          option to transmit
    -4, --ipv4            use IPv4 addresses only
    -6, --ipv6            use IPv6 addresses only

hemanthkota@Hemanths-MBP hemanth.-dattu % git push --set-upstream origin dev     
error: src refspec dev does not match any
error: failed to push some refs to 'git@github.com:hkota69725/hemanth.-dattu.git'
hemanthkota@Hemanths-MBP hemanth.-dattu % git pull
From github.com:hkota69725/hemanth.-dattu
 * [new branch]      dev        -> origin/dev
There is no tracking information for the current branch.
Please specify which branch you want to merge with.
See git-pull(1) for details.

    git pull <remote> <branch>

If you wish to set tracking information for this branch you can do so with:

    git branch --set-upstream-to=origin/<branch> feature

hemanthkota@Hemanths-MBP hemanth.-dattu % pwd
/Users/hemanthkota/Desktop/git/hemanth.-dattu
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch
* feature
  master
hemanthkota@Hemanths-MBP hemanth.-dattu % git push --set-upstream origin dev
error: src refspec dev does not match any
error: failed to push some refs to 'git@github.com:hkota69725/hemanth.-dattu.git'
hemanthkota@Hemanths-MBP hemanth.-dattu % git push --set-upstream origin feature
Enumerating objects: 3, done.
Counting objects: 100% (3/3), done.
Delta compression using up to 8 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (2/2), 261 bytes | 261.00 KiB/s, done.
Total 2 (delta 1), reused 0 (delta 0)
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
remote: 
remote: Create a pull request for 'feature' on GitHub by visiting:
remote:      https://github.com/hkota69725/hemanth.-dattu/pull/new/feature
remote: 
To github.com:hkota69725/hemanth.-dattu.git
 * [new branch]      feature -> feature
Branch 'feature' set up to track remote branch 'feature' from 'origin'.
hemanthkota@Hemanths-MBP hemanth.-dattu % ls
1.cs	1.html	2.cs	2.html	3.cs	4.cs	5.cs	6.cs
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch
* feature
  master
hemanthkota@Hemanths-MBP hemanth.-dattu % git pull
Already up to date.
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch
* feature
  master
hemanthkota@Hemanths-MBP hemanth.-dattu % git pull dev
fatal: 'dev' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
hemanthkota@Hemanths-MBP hemanth.-dattu % git pull https://github.com/hkota69725/hemanth.-dattu/pull/new/dev    
remote: Not Found
fatal: repository 'https://github.com/hkota69725/hemanth.-dattu/pull/new/dev/' not found
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch 
* feature
  master
hemanthkota@Hemanths-MBP hemanth.-dattu % git clone git@github.com:hkota69725/hemanth.-dattu.git
Cloning into 'hemanth.-dattu'...
remote: Enumerating objects: 13, done.
remote: Counting objects: 100% (13/13), done.
remote: Compressing objects: 100% (6/6), done.
remote: Total 13 (delta 1), reused 5 (delta 1), pack-reused 0
Receiving objects: 100% (13/13), done.
Resolving deltas: 100% (1/1), done.
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch
* feature
  master
hemanthkota@Hemanths-MBP hemanth.-dattu % git clone git@github.com:hkota69725/hemanth.-dattu.git
fatal: destination path 'hemanth.-dattu' already exists and is not an empty directory.
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch
* feature
  master
hemanthkota@Hemanths-MBP hemanth.-dattu % git pull
remote: Enumerating objects: 4, done.
remote: Counting objects: 100% (4/4), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), done.
From github.com:hkota69725/hemanth.-dattu
   0dbeb9c..ed2cf7c  dev        -> origin/dev
 * [new branch]      production -> origin/production
Already up to date.
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch
* feature
  master
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch 
* feature
  master
hemanthkota@Hemanths-MBP hemanth.-dattu % git pull * 
fatal: invalid gitfile format: 1.cs
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
hemanthkota@Hemanths-MBP hemanth.-dattu % git clone git@github.com:hkota69725/hemanth.-dattu.git
fatal: destination path 'hemanth.-dattu' already exists and is not an empty directory.
hemanthkota@Hemanths-MBP hemanth.-dattu % git@github.com:hkota69725/hemanth.-dattu.git
zsh: no such file or directory: git@github.com:hkota69725/hemanth.-dattu.git
hemanthkota@Hemanths-MBP hemanth.-dattu % git clone git@github.com:hkota69725/hemanth.-dattu.git
fatal: destination path 'hemanth.-dattu' already exists and is not an empty directory.
hemanthkota@Hemanths-MBP hemanth.-dattu % cd ..
hemanthkota@Hemanths-MBP git % ls
cicd-pipeline-train-schedule-cd	hemanth.-dattu
hemanthkota@Hemanths-MBP git % git@github.com:hkota69725/hemanth.-dattu.git
zsh: no such file or directory: git@github.com:hkota69725/hemanth.-dattu.git
hemanthkota@Hemanths-MBP git % git clone git@github.com:hkota69725/hemanth.-dattu.git
fatal: destination path 'hemanth.-dattu' already exists and is not an empty directory.
hemanthkota@Hemanths-MBP git % git pull git@github.com:hkota69725/hemanth.-dattu.git 
fatal: not a git repository (or any of the parent directories): .git
hemanthkota@Hemanths-MBP git % git pull                                              
fatal: not a git repository (or any of the parent directories): .git
hemanthkota@Hemanths-MBP git % ls
cicd-pipeline-train-schedule-cd	hemanth.-dattu
hemanthkota@Hemanths-MBP git % cd hemanth.-dattu 
hemanthkota@Hemanths-MBP hemanth.-dattu % git pull
Warning: Permanently added the RSA host key for IP address '140.82.113.3' to the list of known hosts.
remote: Enumerating objects: 1, done.
remote: Counting objects: 100% (1/1), done.
remote: Total 1 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (1/1), done.
From github.com:hkota69725/hemanth.-dattu
   69b0fcf..3e5cb53  production -> origin/production
Already up to date.
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch
* feature
  master
hemanthkota@Hemanths-MBP hemanth.-dattu % git branch -a
* feature
  master
  remotes/origin/dev
  remotes/origin/feature
  remotes/origin/master
  remotes/origin/production
hemanthkota@Hemanths-MBP hemanth.-dattu % clear 

hemanthkota@Hemanths-MBP hemanth.-dattu % clear 






























































hemanthkota@Hemanths-MBP hemanth.-dattu % pwd   
/Users/hemanthkota/Desktop/git/hemanth.-dattu
hemanthkota@Hemanths-MBP hemanth.-dattu % cd git
cd: no such file or directory: git
hemanthkota@Hemanths-MBP hemanth.-dattu % cd ..
hemanthkota@Hemanths-MBP git % ls    
cicd-pipeline-train-schedule-cd	hemanth.-dattu
hemanthkota@Hemanths-MBP git % mkdir kotadattuhemanth
hemanthkota@Hemanths-MBP git % cd kotadattuhemanth 
hemanthkota@Hemanths-MBP kotadattuhemanth % ls
hemanthkota@Hemanths-MBP kotadattuhemanth % ls -al
total 0
drwxr-xr-x  2 hemanthkota  staff   64 Apr 27 20:05 .
drwxr-xr-x  5 hemanthkota  staff  160 Apr 27 20:05 ..
hemanthkota@Hemanths-MBP kotadattuhemanth % git init
Initialized empty Git repository in /Users/hemanthkota/Desktop/git/kotadattuhemanth/.git/
hemanthkota@Hemanths-MBP kotadattuhemanth % ls -al
total 0
drwxr-xr-x  3 hemanthkota  staff   96 Apr 27 20:06 .
drwxr-xr-x  5 hemanthkota  staff  160 Apr 27 20:05 ..
drwxr-xr-x  9 hemanthkota  staff  288 Apr 27 20:06 .git
hemanthkota@Hemanths-MBP kotadattuhemanth % git branch -a
hemanthkota@Hemanths-MBP kotadattuhemanth % touch 1.aspx 2.aspx
hemanthkota@Hemanths-MBP kotadattuhemanth % ls a-l
ls: a-l: No such file or directory
hemanthkota@Hemanths-MBP kotadattuhemanth % ls al 
ls: al: No such file or directory
hemanthkota@Hemanths-MBP kotadattuhemanth % ls -al
total 0
drwxr-xr-x  5 hemanthkota  staff  160 Apr 27 20:06 .
drwxr-xr-x  5 hemanthkota  staff  160 Apr 27 20:05 ..
drwxr-xr-x  9 hemanthkota  staff  288 Apr 27 20:06 .git
-rw-r--r--  1 hemanthkota  staff    0 Apr 27 20:06 1.aspx
-rw-r--r--  1 hemanthkota  staff    0 Apr 27 20:06 2.aspx
hemanthkota@Hemanths-MBP kotadattuhemanth % git branch -a
hemanthkota@Hemanths-MBP kotadattuhemanth % git push
fatal: No configured push destination.
Either specify the URL from the command-line or configure a remote repository using

    git remote add <name> <url>

and then push using the remote name

    git push <name>

hemanthkota@Hemanths-MBP kotadattuhemanth % clear

















hemanthkota@Hemanths-MBP kotadattuhemanth % ls-a
zsh: command not found: ls-a
hemanthkota@Hemanths-MBP kotadattuhemanth % ls -al
total 0
drwxr-xr-x  5 hemanthkota  staff  160 Apr 27 20:06 .
drwxr-xr-x  5 hemanthkota  staff  160 Apr 27 20:05 ..
drwxr-xr-x  9 hemanthkota  staff  288 Apr 27 20:06 .git
-rw-r--r--  1 hemanthkota  staff    0 Apr 27 20:06 1.aspx
-rw-r--r--  1 hemanthkota  staff    0 Apr 27 20:06 2.aspx
hemanthkota@Hemanths-MBP kotadattuhemanth % cd ..
hemanthkota@Hemanths-MBP git % ls
cicd-pipeline-train-schedule-cd	hemanth.-dattu			kotadattuhemanth
hemanthkota@Hemanths-MBP git % git clone git@github.com:hkota69725/my-test-kit.git
Cloning into 'my-test-kit'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
Receiving objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
hemanthkota@Hemanths-MBP git % ls -al
total 0
drwxr-xr-x   6 hemanthkota  staff  192 Apr 27 20:13 .
drwx------@  9 hemanthkota  staff  288 Apr 27 14:23 ..
drwxr-xr-x  31 hemanthkota  staff  992 Apr 27 15:32 cicd-pipeline-train-schedule-cd
drwxr-xr-x  12 hemanthkota  staff  384 Apr 27 17:14 hemanth.-dattu
drwxr-xr-x   5 hemanthkota  staff  160 Apr 27 20:06 kotadattuhemanth
drwxr-xr-x   4 hemanthkota  staff  128 Apr 27 20:13 my-test-kit
hemanthkota@Hemanths-MBP git % cd my-test-kit 
hemanthkota@Hemanths-MBP my-test-kit % ls -all
total 8
drwxr-xr-x   4 hemanthkota  staff  128 Apr 27 20:13 .
drwxr-xr-x   6 hemanthkota  staff  192 Apr 27 20:13 ..
drwxr-xr-x  12 hemanthkota  staff  384 Apr 27 20:13 .git
-rw-r--r--   1 hemanthkota  staff   14 Apr 27 20:13 README.md
hemanthkota@Hemanths-MBP my-test-kit % git branch -a
* master
  remotes/origin/HEAD -> origin/master
  remotes/origin/master
hemanthkota@Hemanths-MBP my-test-kit % git branch dev
hemanthkota@Hemanths-MBP my-test-kit % vim pom.xml
hemanthkota@Hemanths-MBP my-test-kit % vim test.java
hemanthkota@Hemanths-MBP my-test-kit % git add .
hemanthkota@Hemanths-MBP my-test-kit % git commit -m "added java and xml files"
[master dca0d98] added java and xml files
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 2 files changed, 127 insertions(+)
 create mode 100644 pom.xml
 create mode 100644 test.java
hemanthkota@Hemanths-MBP my-test-kit % git branch
  dev
* master
hemanthkota@Hemanths-MBP my-test-kit % git push   
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 8 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 1.68 KiB | 1.68 MiB/s, done.
Total 4 (delta 0), reused 0 (delta 0)
To github.com:hkota69725/my-test-kit.git
   500ef1d..dca0d98  master -> master
hemanthkota@Hemanths-MBP my-test-kit % git checkout dev
Switched to branch 'dev'
hemanthkota@Hemanths-MBP my-test-kit % git push
fatal: The current branch dev has no upstream branch.
To push the current branch and set the remote as upstream, use

    git push --set-upstream origin dev

hemanthkota@Hemanths-MBP my-test-kit % git push --set-upstream origin dev
Total 0 (delta 0), reused 0 (delta 0)
remote: 
remote: Create a pull request for 'dev' on GitHub by visiting:
remote:      https://github.com/hkota69725/my-test-kit/pull/new/dev
remote: 
To github.com:hkota69725/my-test-kit.git
 * [new branch]      dev -> dev
Branch 'dev' set up to track remote branch 'dev' from 'origin'.
hemanthkota@Hemanths-MBP my-test-kit % git branch -a
* dev
  master
  remotes/origin/HEAD -> origin/master
  remotes/origin/dev
  remotes/origin/master
hemanthkota@Hemanths-MBP my-test-kit % vim index.js
hemanthkota@Hemanths-MBP my-test-kit % vim package.json
hemanthkota@Hemanths-MBP my-test-kit % git add .
hemanthkota@Hemanths-MBP my-test-kit % git commit -m "added filkes to dev folder"
[dev 8f4eb1e] added filkes to dev folder
 Committer: Hemanth Kota <hemanthkota@Hemanths-MBP.lan>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 2 files changed, 81 insertions(+)
 create mode 100644 index.js
 create mode 100644 package.json
hemanthkota@Hemanths-MBP my-test-kit % git push
Enumerating objects: 5, done.
Counting objects: 100% (5/5), done.
Delta compression using up to 8 threads
Compressing objects: 100% (4/4), done.
Writing objects: 100% (4/4), 1.02 KiB | 1.02 MiB/s, done.
Total 4 (delta 0), reused 0 (delta 0)
To github.com:hkota69725/my-test-kit.git
   500ef1d..8f4eb1e  dev -> dev
hemanthkota@Hemanths-MBP my-test-kit % ls  
README.md	index.js	package.json
hemanthkota@Hemanths-MBP my-test-kit % git checkout master
Switched to branch 'master'
Your branch is up to date with 'origin/master'.
hemanthkota@Hemanths-MBP my-test-kit % ls
README.md	pom.xml		test.java
hemanthkota@Hemanths-MBP my-test-kit % vim test.java
hemanthkota@Hemanths-MBP my-test-kit % vim test.java

>>>>>>> dev
import java.net.MalformedURLException;
import java.net.UR.dattuL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * IOS Browser Sauce Labs Test.
 */
public class IOSBrowserSaucelabsTest
{
<<<<<<< HEAD
	public static final String USERNAME = "YOUR_USERNAME";
	public static final String ACCESS_KEY = "YOUR_ACESS_KEY";
	public static final String URL = "https://"+USERNAME+":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	public static IOSDriver<?> mobiledriver;

	@BeforeTest
	public void beforeTest( ) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2.2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
		capabilities.setCapability("newCommandTimeout", 2000);
		mobiledriver = new IOSDriver<>(new URL(URL), capabilities);

	}

	@AfterTest
	public void afterTest( ) {
		mobiledriver.quit();
	}

	@Test
	public static void launchBrowser(){
		mobiledriver.get("http://appium.io/");
		Assert.assertEquals(mobiledriver.getCurrentUrl(), "http://appium.io/", "URL Mismatch");
		Assert.assertEquals(mobiledriver.getTitle(), "Appium: Mobile App Automation Made Awesome.", "Title Mismatch");
	}
}
=======
        public static final String USERNAME = "YOUR_USERNAME";
        public static final String ACCESS_KEY = "YOUR_ACESS_KEY";
        public static final String URL = "https://"+USERNAME+":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
        public static IOSDriver<?> mobiledriver;

        @BeforeTest
        public void beforeTest( ) throws MalformedURLException {
                DesiredCapabilities capabilities = new DesiredCapabilities();

                capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.2");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.2.2");
                capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"iOS");
                capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
                capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone Simulator");
                capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
                capabilities.setCapability("newCommandTimeout", 2000);
                mobiledriver = new IOSDriver<>(new URL(URL), capabilities);

        }

        @AfterTest
        public void afterTest( ) {
                mobiledriver.quit();
        }

        @Test
        public static void launchBrowser(){
                mobiledriver.get("http://appium.io/");
                Assert.assertEquals(mobiledriver.getCurrentUrl(), "http://appium.io/", "URL Mismatch");
                Assert.assertEquals(mobiledriver.getTitle(), "Appium: Mobile App Automation Made Awesome.", "Title Mismatch");
        }
}
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
~                                                                                                                                                                                                           
-- INSERT --

>>>>>>> dev
