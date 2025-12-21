Here's a clean and professional `README.md` file tailored for your Git command reference project. This will help others understand the purpose of your repository and how to use the commands you've documented.

---

````markdown
# Git Command Reference Guide 📘

This repository contains a comprehensive list of commonly used Git commands along with their explanations. It's designed to help beginners and intermediate developers understand and use Git effectively in their projects.

## 🔧 Git Setup

```bash
git --version
```
````

Check the installed Git version.

```bash
git config --global --list
```

List global Git configuration settings.

```bash
git config --global user.name "Bhaskar Mudaliyar"
git config --global user.email "mudaliyarbhaskar29@gmail.com"
```

Set global username and email for Git commits.

## 📁 Repository Initialization

```bash
git init -b main
```

Initialize a new Git repository with `main` as the default branch.

## 📊 Status and Staging

```bash
git status
```

Show the status of tracked and untracked files.

```bash
git add .
```

Add all changes to the staging area.

## ✅ Committing Changes

```bash
git commit -m "First commit"
```

Commit staged changes with a message.

```bash
git commit -a -m "First commit"
```

Commit all tracked changes directly, skipping staging.

## 🔍 Viewing Changes

```bash
git diff
```

Show differences between working directory and last commit.

```bash
git diff --staged
```

Show differences between staged changes and last commit.

## 🧹 Removing Files

```bash
git rm --cached cred.txt
```

Untrack a file without deleting it from the local system.

## 🌐 Remote Repository

```bash
git remote add origin https://github.com/bhaskar290391/Java_By_Telusko.git
```

Connect local repository to a remote GitHub repository.

```bash
git branch -M master
```

Rename current branch to `master`.

```bash
git push -u origin main
```

Push local `main` branch to remote repository.

## 🏷️ Tagging Releases

```bash
git tag -a v1.0 -m "First release"
```

Create an annotated tag for a release.

```bash
git tag
```

List all tags in the repository.

```bash
git push origin v1.0
```

Push a specific tag to the remote repository.

## 📥 Cloning and Branching

```bash
git clone https://github.com/bhaskar290391/Java_By_Telusko.git
```

Clone a remote repository.

```bash
git checkout -b feature1
```

Create and switch to a new branch `feature1`.

```bash
git switch feature2
```

Switch to an existing branch `feature2`.

```bash
git branch
```

List all branches and highlight the current one.

```bash
git branch -d feature2
```

Delete the branch `feature2`.

## 🔀 Merging and Rebasing

```bash
git merge feature1
```

Merge `feature1` into the current branch (usually `main`).

```bash
git rebase feature2
```

Rebase `feature2` onto the current branch for a linear history.

## 🧳 Stashing Changes

```bash
git stash
```

Temporarily save changes without committing.

```bash
git stash list
```

List all stashed changes.

```bash
git stash apply
```

Apply the most recent stash.

---

## 📌 Author

**Bhaskar Mudaliyar**  
📧 [mudaliyarbhaskar29@gmail.com](mailto:mudaliyarbhaskar29@gmail.com)

---

Feel free to contribute or suggest improvements to this guide!

```

---

Let me know if you'd like to add visuals, examples, or convert this into a GitHub Pages site.
```
