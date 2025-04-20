# GitHub Actions Workflow Examples

This repository contains three practical examples of GitHub Actions workflows—ranging from basic to advanced—designed to help you learn how to create automation pipelines using different GitHub Actions features.

---

## 📘 Workflow Examples

### 1. Basic – Single Job with Multiple Event Triggers

This example demonstrates how to create a workflow with a **single job** triggered by multiple events such as:
- `push`
- `pull_request`
- `issues`

📁 File: `.github/workflows/basic.yml`

> Useful for: Simple CI tasks, like running tests or linting on code pushes or pull requests.


### 2. Medium – Workflow Dispatch and Scheduled Cron Job

This workflow uses:
- `workflow_dispatch` for manual triggering via the GitHub UI
- `schedule` for automatic execution based on a **cron schedule**

📁 File: `.github/workflows/medium.yml`

> Useful for: Running recurring tasks such as backups, cleanups, or report generation.


### 3. Advanced – Docker Container, JavaScript, and Composite Actions

A more sophisticated setup combining:
- **Docker container** as the job environment
- **JavaScript GitHub Action** to run a custom script
- **Composite Action** for compilling multiple actions

📁 File: `.github/workflows/advanced.yml`  
Custom Actions:
- JavaScript Action: `js-actions/`
- Composite Action: `actions/composite/`

> Useful for: Building modular, maintainable, and portable CI/CD workflows.


## 🚀 How to Use

1. Clone this repo:  
   ```bash
   git clone https://github.com/your-username/GitHub_Actions_Basic_To_Advanced.git
